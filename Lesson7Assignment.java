package com.skoohgoli.java201;

public class Lesson7Assignment {

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



    public MyLinkedList linkedListSort(MyLinkedList input) {
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
        Lesson7Assignment sorter = new Lesson7Assignment();

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

        MyLinkedList linkedResult = sorter.linkedListSort(linkedInput);

        Node resultNode = linkedResult.head;
        Node expectedNode = linkedExpected.head;
        while (resultNode != null && expectedNode != null) {
            if (resultNode.value != expectedNode.value) {
                throw new RuntimeException("List was not recursively sorted properly. Expected " + expectedNode.value
                        + "but got " + resultNode.value);
            }
            resultNode = resultNode.next;
            expectedNode = expectedNode.next;
        }

    }
}
