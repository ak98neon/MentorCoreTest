package com.ak98neon.TaskTwo;

public class FindMinPalindrome {
    public static void main(String[] args) {
        System.out.println(find(256));
    }

    public static int find(int n) {
        for (int i = n; i < Integer.MAX_VALUE; i++) {
            StringBuilder str = new StringBuilder(String.valueOf(i));
            str.reverse();
            int reverseNumber = Integer.parseInt(str.toString());
            if (reverseNumber == i) {
                return i;
            }
        }

        return n;
    }
}