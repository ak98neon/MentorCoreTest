package com.ak98neon.TaskThree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFindString {
    @Test
    public void testFindString() {
        String[] array = {"five", "fivetwo", "fourfive", "fourfivetwo", "one", "onefiveone", "two", "twofivefourone"};
        assertEquals("fourfivetwo", new FindString().find(array));
    }
}
