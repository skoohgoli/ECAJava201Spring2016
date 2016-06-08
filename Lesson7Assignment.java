package com.skoohgoli.java201;

import java.util.LinkedList;

public class SelectionSorter {

    public int[] iterativeSort(int[] input) {
        if (input == null) {
            return input;
        }
        int length = input.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (input[j] < input[i]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

    public LinkedList<Integer> sort(LinkedList<Integer> input) {
        return null;
    }

    public int[] recursiveSort(int[] input) {
        return null;
    }
}
