package com.skoohgoli.java201;


import java.util.HashMap;
import java.util.Map;

public class FibonacciSolver {

    private Map<Integer, Integer> savedNumbersMap;

    public FibonacciSolver() {
        this.savedNumbersMap = new HashMap<>();
        savedNumbersMap.put(new Integer(1), new Integer((1)));
        savedNumbersMap.put(new Integer(2), new Integer((1)));
    }

    //This will have a very very long runtime
    public int basicFibonacci (int n) {
        System.out.println("basicFibonacci: processing for " + n);
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return basicFibonacci(n - 1) + basicFibonacci(n - 2);
        }
    }

    //This runtime will be significantly shorter
    public int amortizedFibonacci (int n) {
        System.out.println("amortizedFibonacci: processing for " + n);
        if (n < 1) {
            return 0;
        } else {
            //We're going to calculate and store all fibonacci numbers less than n. That way, we don't have to recurse endlessly!
            //Added bonus: if we ever call this function again, the runtime may only be O(1)
            Integer nteger = new Integer(n);
            if (savedNumbersMap.containsKey(nteger)) {
                return savedNumbersMap.get(nteger);
            } else {
                int fibonacciNumber = amortizedFibonacci(n - 1) + amortizedFibonacci(n - 2);
                savedNumbersMap.put(nteger, fibonacciNumber);
                return fibonacciNumber;
            }
        }
    }


    public static void main(String[] args) {
        FibonacciSolver solver = new FibonacciSolver();

        //Lets compare the difference in the length of output:
        System.out.println(solver.basicFibonacci(10)); //109 function calls
        System.out.println(solver.amortizedFibonacci(10)); //only 17 function calls!
        System.out.println(solver.amortizedFibonacci(10)); //No recursion needed, since we already have the answer stored in memory
    }

}
