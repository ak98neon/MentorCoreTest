package com.ak98neon.TaskThree;

import java.util.Set;
import java.util.TreeSet;

public class FindString {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i * (int)(Math.random() * 10));
        }

        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }
}
