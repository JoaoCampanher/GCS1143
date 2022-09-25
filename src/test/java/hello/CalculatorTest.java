package hello;
 import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class CalculatorTest {
    @Test
    public void testGetSecond() {
        Calculator app = new Calculator();
        int result = app.getSecond(9);
        assertEquals(81, result);
    }

    @Test
    public void testGetThird() {
        Calculator app = new Calculator();
        int result = app.getThird(4);
        assertEquals(64, result);
    }
}