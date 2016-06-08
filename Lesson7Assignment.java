package com.skoohgoli.java201;

import java.util.Arrays;
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

    //You may want to change the arguments for the method, if it makes things easier
    public int[] recursiveSort(int[] input) {
        return null;
    }

    private static boolean isSame(int[] expected, int[] result) {
        if (result.length != expected.length) {
            return false;
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] != expected[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SelectionSorter sorter = new SelectionSorter();

        int[] input = {98, 7654, 2, 3456, 66};
        int[] expected = {2, 66, 98, 3456, 7654};

        int[] result = sorter.iterativeSort(input);
        if (!isSame(expected, result)) {
            throw new RuntimeException("Array was not iteratively sorted properly: " + result);
        }

        result = sorter.recursiveSort(input);
        if (!isSame(expected, result)) {
            throw new RuntimeException("Array was not recursively sorted properly: " + result);
        }


        LinkedList<Integer> linkedInput = new LinkedList<>();
        linkedInput.addAll(Arrays.asList(98, 7654, 2, 3546, 66));
        LinkedList<Integer> linkedResult = new LinkedList<>();
        linkedResult.addAll(Arrays.asList(2, 66, 98, 3546, 7654));
        result = sorter.recursiveSort(input);
        if (result != expected) {
            throw new RuntimeException("Array was not recursively sorted properly: " + result);
        }

    }
}
