package ua.gostart.goit.Module4;

import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;

public class RunnerTest {

    private static Runner s;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("\nsetUpClass method called!\n");
    }

    @org.junit.Test(timeout = 1000)
    public void testCircleSquare() throws Exception {
        int a = 4;
        double expectedArea = Math.PI*a*a;
        assertEquals(expectedArea, Runner.circleSquare(4),0.0f);
    }

    @org.junit.Test(timeout = 1000)
    public void testRectangleSquare() throws Exception {
        int a = 4;
        int b = 5;
        final double res = Runner.rectangleSquare(a, b);
        assertEquals(a * b, res, 0.0f);
    }

    @org.junit.Test(timeout = 1000)
    public void testTriangleSquare() throws Exception {
        int a = 4;
        int b = 5;
        int c = 6;
        double expectedArea = Runner.triangleSquare(a, b, c);
        assertEquals(expectedArea, Runner.triangleSquare(a, b, c),0.0f);
    }

    @org.junit.Test(timeout = 1000)
    public void testFarengeitToCelsiy() throws Exception {
        int a = 100;
        double expectedArea = Runner.celsiyToFarengeit(a);
        assertEquals(expectedArea, Runner.celsiyToFarengeit(a),0.0f);
    }

    @org.junit.Test(timeout = 1000)
    public void testCelsiyToFarengeit() throws Exception {
        int a = 212;
        double expectedArea = Runner.farengeitToCelsiy(a);
        assertEquals(expectedArea, Runner.farengeitToCelsiy(a), 0.0f);
    }

}