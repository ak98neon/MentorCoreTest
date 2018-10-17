package com.ak98neon.TaskOne;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestFindNumber {
    @Test
    public void testFind() {
        YamlArray yamlArray = new YamlArray();
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5};

        assertEquals(5, yamlArray.find(arr));
    }

    @Test
    public void testGenerate() {
        YamlArray yamlArray = new YamlArray();
        assertEquals(9, yamlArray.generate().length);
    }

    @Test(timeout = 5000)
    public void testSaveFile() throws IOException {
        String file = "test.yaml";
        YamlArray yamlArray = new YamlArray();
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5};

        yamlArray.saveFile(arr, file);
        int[] loadArr = yamlArray.readFile(file);

        assertArrayEquals(loadArr, arr);
    }
}
