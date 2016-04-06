//    Покрыть юнит-тестами код к домашним заданиям лекций №4, №5, №9 и №10.
package ua.gostart.goit.Module4;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class RunnerTest {


    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("\nsetUpClass method called!\n");
    }

    @org.junit.Test
    public void testCircleSquare() throws Exception {
        int a = 4;
        double expectedArea = Math.PI * a * a;
        assertEquals(expectedArea, Runner.circleSquare(4), 0.0f);
    }
    @Ignore
    @org.junit.Test
    public void testCircleSquare1() throws Exception {
        while (true){
        int a = 4;
        double expectedArea = Math.PI * a * a;
        assertEquals(expectedArea, Runner.circleSquare(4), 0.0f);
        }
    }

    @org.junit.Test
    public void testRectangleSquare() throws Exception {
        int a = 4;
        int b = 5;
        final double res = Runner.rectangleSquare(a, b);
        assertEquals(a * b, res, 0.0f);
    }

    @org.junit.Test
    public void testTriangleSquare() throws Exception {
        int a = 4;
        int b = 5;
        int c = 6;
        double expectedArea = Runner.triangleSquare(a, b, c);
        assertEquals(expectedArea, Runner.triangleSquare(a, b, c),0.0f);
    }

    @org.junit.Test
    public void testFarengeitToCelsiy() throws Exception {
        int a = 100;
        double expectedArea = Runner.celsiyToFarengeit(a);
        assertEquals(expectedArea, Runner.celsiyToFarengeit(a),0.0f);
    }

    @org.junit.Test
    public void testCelsiyToFarengeit() throws Exception {
        int a = 212;
        double expectedArea = Runner.farengeitToCelsiy(a);
        assertEquals(expectedArea, Runner.farengeitToCelsiy(a), 0.0f);
    }

}