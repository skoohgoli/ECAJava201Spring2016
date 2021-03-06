package com.skoohgoli.java201;


import java.util.Arrays;

public class Lesson8Assignment {

    public int[] mergeSort(int[] input) {
        int length = input.length;

        if (length == 1) {
            return input;
        }

        //Keep on splitting the case down to the smallest version (length 1)
        int[] left = mergeSort(Arrays.copyOfRange(input, 0, length/2));
        int[] right = mergeSort(Arrays.copyOfRange(input, length/2, length));

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;

        int leftIndex = 0;
        int rightIndex = 0;

        int[] mergedResult = new int[left.length + right.length];
        int mergedResultIndex = 0;

        //The main merging. Step through the elements one at a time
        while (leftIndex < leftLength && rightIndex < rightLength) {
            if (left[leftIndex] < right[rightIndex]) {
                mergedResult[mergedResultIndex] = left[leftIndex];
                leftIndex++;
            } else {
                mergedResult[mergedResultIndex] = right[rightIndex];
                rightIndex++;
            }
            mergedResultIndex++;
        }

        //If there are any leftover elements in the array, merge them together
        //This happens when the left array and the right array are not the same size.
        if (leftIndex == leftLength) {
            while (rightIndex < rightLength) {
                mergedResult[mergedResultIndex] = right[rightIndex];
                rightIndex++;
                mergedResultIndex++;
            }
        }
        if (rightIndex == rightLength) {
            while (leftIndex < leftLength) {
                mergedResult[mergedResultIndex] = left[leftIndex];
                leftIndex++;
                mergedResultIndex++;
            }
        }
        return mergedResult;
    }

    public int[] inPlaceMergeSort(int[] input) {
        //The public function should stay the same.
        // You can create inner recursive functions though
        return null;
    }

    public MyLinkedList mergeLinkedListSort(MyLinkedList head) {
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
        Lesson8Assignment sorter = new Lesson8Assignment();

        int[] input = {98, 7654, 2, 3456, 66};
        int[] expected = {2, 66, 98, 3456, 7654};

        int[] result = sorter.mergeSort(input);
        if (!isSame(expected, result)) {
            throw new RuntimeException("Array was not recursively sorted properly: " + result);
        }

        int[] input2 = {98, 7654, 2, 3456, 66};
        result = sorter.inPlaceMergeSort(input2);
        if (!isSame(expected, result)) {
            throw new RuntimeException("Array was not iteratively sorted properly: " + result);
        }

        MyLinkedList linkedInput = new MyLinkedList();
        linkedInput.add(new Node(98))
                .add(new Node(7654))
                .add(new Node(2))
                .add(new Node(3456))
                .add(new Node(66));

        MyLinkedList linkedExpected = new MyLinkedList();
        linkedExpected.add(new Node(2))
                .add(new Node(66))
                .add(new Node(98))
                .add(new Node(3456))
                .add(new Node(7654));

        MyLinkedList linkedResult = sorter.mergeLinkedListSort(linkedInput);

        Node resultNode = linkedResult.head;
        Node expectedNode = linkedExpected.head;
        while (resultNode != null && expectedNode != null) {
            if (resultNode.value != expectedNode.value) {
                throw new RuntimeException("List was not sorted properly. Expected " + expectedNode.value
                        + "but got " + resultNode.value);
            }
            resultNode = resultNode.next;
            expectedNode = expectedNode.next;
        }

    }

}
