package com.ak98neon.TaskThree;

public class FindString {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        System.out.println(ArrayAlg.minAndmax(arr));
    }
}

class ArrayAlg {
    public static <T extends Comparable> Pair<T> minAndmax(T[] arr) {
        if (arr == null || arr.length == 0) { return null; }
        T min = arr[0];
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min.compareTo(arr[i]) > 0) { min = arr[i]; }
            if (max.compareTo(arr[i]) < 0) { max = arr[i]; }
        }
        return new Pair<>(min, max);
    }
}

class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "min=" + first +
                ", max=" + second +
                '}';
    }
}