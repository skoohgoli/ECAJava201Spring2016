package com.skoohgoli.java201;

import java.util.Stack;

/**
 * For this assignment, you will have to implement a queue, but instead of it relying on a linked list, it will rely on stacks.
 * Please fill out the function below, and use try/catch blocks to handle all errors.
 * You may add additional internal variables to the class if you see fit
 */
public class MyStackQueue<String> {
    private Stack<String> inbox;
    private Stack<String> outbox;

    public MyStackQueue() {
        inbox = new Stack<>();
        outbox = new Stack<>();
    }

    /**
     * Insert a string into the back queue.
     * @param input
     * @return true if successful, false otherwise. Should not throw any exceptions.
     */
    public boolean enqueue(String input) {

        return false;
    }

    /**
     * Remove the string from the front of the queue.
     * @return the string if successful, null otherwise or if the queue is empty. Should not throw any exceptions
     */
    public String dequeue() {
        return null;
    }

    /**
     * @return the number of elements in the queue. Should not throw any exceptions.
     */
    public int length() {
        return 0;
    }

    /**
     * Prints out the queue in order, with the first element inserted into the array being the first element printed, etc
     * @return Does not return anything. It's a void function
     */
    public void print() {

    }
}
