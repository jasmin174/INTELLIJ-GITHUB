package com.tests.java;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.methods.java.personnage;
import org.junit.jupiter.api.Test;


public class gameTest {
    @Test
    public void testTournerZero() {
        personnage personnage = new personnage();
        assertEquals("NORD", personnage.Tourner(0));
    }
}
