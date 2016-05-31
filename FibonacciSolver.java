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

    //This runtime will be much shorter, at worst O(n)
    public int amortizedFibonacci (int n) {
        System.out.println("amortizedFibonacci: processing for " + n);
        if (n < 1) {
            return 0;
        } else {
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
    }

}
