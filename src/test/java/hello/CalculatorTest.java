package hello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testGetSecond() {
        assertEquals(81, calculator.getSecond(9));
    }

    @Test
    public void testGetThird() {
        assertEquals(64, calculator.getThird(4));
    }
}