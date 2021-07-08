package net.jaxley.java201;

/**
 * Created by jaxley on 6/1/16.
 * Reverse a string using recursion (no loops):
 You can solve the same problem with many different methods!
 We've already solved it with stacks and loops. Don't worry, this will be the last time you'll see this problem.
 */
public class ReverseUsingRecursion {
    public static String reverse(String forward) {
        if (forward == null || forward.isEmpty()) {
            return forward;
        }

        int lastCharPosition = forward.length() - 1;
        return forward.charAt(lastCharPosition) + reverse(forward.substring(0, lastCharPosition));

        // each recursive call will strip off the last character and process the remaining string.
        // n
        // o
        // s
        // a
        // J
    }
}
