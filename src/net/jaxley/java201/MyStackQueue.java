package net.jaxley.java201;

import java.util.Stack;

/**
 * For this assignment, you will have to implement a queue, but instead of it relying on a linked list, it will rely on stacks.
 * Please fill out the function below, and use try/catch blocks to handle all errors.
 * You may add additional internal variables to the class if you see fit
 */
public class MyStackQueue<T> {
    private Stack<T> inbox;     // back of queue (in reverse order)
    private Stack<T> outbox;    // front of queue

    public MyStackQueue() {
        inbox = new Stack<>();
        outbox = new Stack<>();
    }

    /**
     * Insert a string into the back queue.
     * @param input
     * @return true if successful, false otherwise. Should not throw any exceptions.
     */
    public boolean enqueue(T input) {

        // two <--> one
        // enqueue("three"):
        // three <--> two <--> one
        // inbox: three, outbox:  one, two
        // enqueue("four"):
        // four <--> three <--> two <--> one
        // inbox:  four, three, outbox:  one, two
        // dequeue():  one
        // inbox: empty, outbox:  two, three, four
        try {
            // new strings to into the inbox stack
            inbox.push(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Remove the string from the front of the queue.
     * @return the string if successful, null otherwise or if the queue is empty. Should not throw any exceptions
     */
    public T dequeue() {

        try {
            if (!inbox.isEmpty()) {
                // fill up the outbox first
                fillOutbox();
            }
            // top element in outbox is the front of the queue.
            return outbox.pop();
        } catch (Exception e) {
            return null;
        }
    }

    private void fillOutbox() {
        while (!inbox.empty()) {
            //System.out.println(String.format("moving item [%s] from inbox to outbox.", inbox.peek()));
            // moving to the outbox stack results in reversing the items so they are in queue order of a FIFO
            outbox.push(inbox.pop());
        }
    }

    /**
     * @return the number of elements in the queue. Should not throw any exceptions.
     */
    public int length() {
        return inbox.size() + outbox.size();
    }

    /**
     * Prints out the queue in order, with the first element inserted into the array being the first element printed, etc
     * @return Does not return anything. It's a void function
     */
    public void print() {
        // make sure outbox is full so items are in the right order
        fillOutbox();
        while (!outbox.empty()) {
            T item = outbox.pop();
            System.out.println(item);
            inbox.push(item);      // put it back in inbox so we don't lose it.
        }
    }
}
