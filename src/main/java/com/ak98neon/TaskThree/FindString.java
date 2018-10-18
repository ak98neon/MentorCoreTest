package com.ak98neon.TaskThree;

import java.util.Arrays;

public class FindString {
    public String find(String[] arr) {
        Arrays.sort(arr, ((o1, o2) -> o2.length() - o1.length()));
        String mask;
        for (int i = 0; i < arr.length; i++) {
            mask = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (mask.contains(arr[j])) {
                    mask = mask.replace(arr[j], "");
                    if (mask.length() == 0) {
                        return arr[i];
                    }
                }
            }
        }
        return "";
    }
}