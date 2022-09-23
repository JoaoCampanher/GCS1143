package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void testGetSecond() {
        assertEquals(getSecond(2), 4);
    }
    @Test
    public void testGetSecond() {
        assertEquals(getThird(2), 8);
    }
}
