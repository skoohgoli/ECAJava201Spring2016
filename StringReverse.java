package com.skoohgoli.java201.Lesson6;

public class StringReverse {

    public String reverseRecursive(String input) {
        if (input == null || input.length() == 0) {
            return "";
        } else {
            return reverseRecursive(input.substring(1)) + input.charAt(0);
        }
    }

    public void reverseRecursivePrint(String input) {
        if (input == null || input.length() == 0) {
            return;
        } else {
            reverseRecursivePrint(input.substring(1, input.length()));
            System.out.print(input.charAt(0));
        }
    }

    public String reverseLoops(String input) {
        String result = "";
        if (input == null) {
            return result;
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        StringReverse reverse = new StringReverse();
        reverse.reverseRecursivePrint("oh my");
        System.out.println();
        System.out.println(reverse.reverseRecursive("hello"));
        System.out.println(reverse.reverseLoops("sup"));
    }
}
