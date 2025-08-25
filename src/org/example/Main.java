package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sample = {5, 2, 9, 1, 5, 6};
        Sorter sorter = new BubbleSort();
        sorter.sort(sample);
        System.out.println("Scaffold ready. Current array: " + Arrays.toString(sample));
    }
}
