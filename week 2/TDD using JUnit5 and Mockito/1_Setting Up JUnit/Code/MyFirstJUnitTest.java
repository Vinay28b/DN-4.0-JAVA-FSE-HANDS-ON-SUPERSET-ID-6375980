package com.example; 

import static org.junit.Assert.assertEquals;
import org.junit.Test;  

public class MyFirstJUnitTest {

    @Test
    public void additionShouldWork() {
        int sum = 2 + 3;
        assertEquals(5, sum); 
    }
}
