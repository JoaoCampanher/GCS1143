package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void testGetSecond() {
        assertEquals(Main.getSecond(2), 4);
    }
    @Test
    public void testGetSecond() {
        assertEquals(Main.getThird(2), 8);
    }

}