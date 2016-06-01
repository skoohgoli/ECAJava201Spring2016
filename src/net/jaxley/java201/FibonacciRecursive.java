package net.jaxley.java201;

/**
 * Created by jaxley on 6/1/16.
 */
public class FibonacciRecursive {

    /**
     * Calculates and returns the nth number of the Fibonacci sequence
     * @param n
     * @return
     */
    public static int fib(int n) {
        // Fibonacci number n Fn = Fn-1 + Fn-2, where F1 = 1, F2 = 1
        if (n >= 0) {
            switch (n) {
                case 0:
                    // return 0 for input of 0
                    return 0;
                case 1:
                    // first seed number F1 = 1
                case 2:
                    // second seed number F2 = 1
                    // both return 1
                    return 1;
                default:
                    return fib(n - 1) + fib(n - 2);
            }
        } else {
            // negative input => return 0
            return 0;
        }
    }
}
