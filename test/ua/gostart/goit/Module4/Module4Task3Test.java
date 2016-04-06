package ua.gostart.goit.Module4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Module4Task3Test {

    @Test
    public void testSs() throws Exception {
        int a = 4;
        int b = 5;
        int c = 6;
        int d = 7;
        double expected = Module4Task3.ss(a, b, c, d);
        assertEquals(expected, Module4Task3.ss(a, b, c, d),0.0f);

    }
}