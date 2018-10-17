package com.ak98neon.TaskTwo;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPalindrom {
    @Test
    public void testGetPalindrom() {
        assertEquals(262, FindMinPalindrome.find(256));
        assertEquals(1661, FindMinPalindrome.find(1585));
        assertEquals(1, FindMinPalindrome.find(1));
    }
}
