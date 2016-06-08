package com.skoohgoli.java201;

import java.util.LinkedList;

public class SelectionSorter {

    public int[] iterativeSort(int[] input) {
        if (input == null) {
            return input;
        }
        int length = input.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            
            //find the smallest number in the sub-array
            for (int j = i; j < length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            
            //if the smallest number is not at input[i], swap so that it is
            if (minIndex != i) {
                int temp = input[i];
                input[i] = input[minIndex];
                input[minIndex] = temp;
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
