package com.ak98neon.TaskOne;

import java.io.IOException;
import java.util.Arrays;

public class FindNumber {
    public static void main(String[] args) throws IOException {
        String file = "file.yaml";
        int[] arr;
        YamlArray yamlArray = new YamlArray();
        arr = yamlArray.generate();
        yamlArray.saveFile(arr, file);
        arr = yamlArray.readFile(file);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Result: " + yamlArray.find(arr));
    }
}
