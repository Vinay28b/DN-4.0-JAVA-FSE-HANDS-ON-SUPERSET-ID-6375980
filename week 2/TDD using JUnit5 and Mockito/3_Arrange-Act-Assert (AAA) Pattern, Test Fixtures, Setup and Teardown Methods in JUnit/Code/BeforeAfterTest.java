package com.example;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BeforeAfterTest {

    private StringBuilder sb;

    @Before
    public void setUp() {
        sb = new StringBuilder();
        sb.append("Start-");
        System.out.println("Before: Initializing resources");
    }

    @After
    public void tearDown() {
        sb = null;
        System.out.println("After: Cleaning up resources");
    }

    @Test
    public void testAppendHello() {
        sb.append("Hello");
        assertEquals("Start-Hello", sb.toString());
    }

    @Test
    public void testAppendWorld() {
        sb.append("World");
        assertEquals("Start-World", sb.toString());
    }
}
