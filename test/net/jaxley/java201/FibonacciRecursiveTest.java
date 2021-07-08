package net.jaxley.java201;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jaxley on 6/1/16.
 */
public class FibonacciRecursiveTest {
    @Test
    public void fib() throws Exception {

        Assert.assertEquals(2, FibonacciRecursive.fib(3));
        Assert.assertEquals(5, FibonacciRecursive.fib(5));

        // negative/0 input, return 0
        Assert.assertEquals(0, FibonacciRecursive.fib(-100));
        Assert.assertEquals(0, FibonacciRecursive.fib(0));

        // Try some bigger numbers
        Assert.assertEquals(6765, FibonacciRecursive.fib(20));
    }
}