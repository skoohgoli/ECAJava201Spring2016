package com.skoohgoli.java201.Lesson6;

import java.util.Queue;
import java.util.Stack;

public class MyTree {
    public class Node {
        String value;
        Node left;
        Node right;

        public Node(String value) {
            this.value = value;
        }
    }

    public boolean breadthFirstSearch(String value, Queue<Node> toVisit) {
        if (toVisit.isEmpty()) {
            return false;
        }
        Node input = toVisit.remove();
        if (input != null && input.value == value) {
            return true;
        } else {
            if (input.left  != null)  toVisit.add(input.left);
            if (input.right != null)  toVisit.add(input.right);
            return breadthFirstSearch(value, toVisit);
        }
    }

    public boolean depthFirstSearch(String value, Stack<Node> toVisit) {
        if (toVisit.isEmpty()) {
            return false;
        }
        Node input = toVisit.pop();
        if (input != null && input.value == value) {
            return true;
        } else {
            if (input.left  != null)  toVisit.push(input.left);
            if (input.right != null)  toVisit.push(input.right);
            return depthFirstSearch(value, toVisit);
        }
    }

}
