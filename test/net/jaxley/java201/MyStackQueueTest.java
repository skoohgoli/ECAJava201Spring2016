package net.jaxley.java201;

import org.junit.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.junit.Assert.*;

/**
 * Created by jaxley on 5/20/16.
 */
public class MyStackQueueTest {
    @org.junit.Test
    public void enqueue() throws Exception {
        MyStackQueue<String> sq = new MyStackQueue<>();
        sq.enqueue("one");
        sq.enqueue("two");
        sq.enqueue("three");
    }

    @org.junit.Test
    public void dequeue() throws Exception {
        MyStackQueue<String> sq = new MyStackQueue<>();
        sq.enqueue("one");
        sq.enqueue("two");
        sq.enqueue("three");
        String item = sq.dequeue();
        Assert.assertEquals("one", item);
        item = sq.dequeue();
        Assert.assertEquals("two", item);
    }

    @org.junit.Test
    public void length() throws Exception {
        MyStackQueue<String> sq = new MyStackQueue<>();
        sq.enqueue("one");
        sq.enqueue("two");
        sq.enqueue("three");
        Assert.assertEquals(3, sq.length());
        sq.dequeue();
        Assert.assertEquals(2, sq.length());
    }

    @org.junit.Test
    public void print() throws Exception {
        MyStackQueue<String> sq = new MyStackQueue<>();
        sq.enqueue("one");
        sq.enqueue("two");
        sq.enqueue("three");
        sq.print();
    }

}