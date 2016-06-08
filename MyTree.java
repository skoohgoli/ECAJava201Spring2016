package com.skoohgoli.java201.Lesson6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyTree {
    public class TreeNode {
        String value;
        TreeNode left;
        TreeNode right;

        public TreeNode(String value) {
            this.value = value;
        }
    }

    private TreeNode headOfTree;

    public MyTree(TreeNode head) {
        this.headOfTree = head;
    }

    public boolean breadthFirstSearch(String value) {
        Queue<TreeNode> toVisit = new LinkedList<>();
        toVisit.add(headOfTree);
        return breadthFirstSearch(value, toVisit);
    }

    private boolean breadthFirstSearch(String value, Queue<TreeNode> toVisit) {
        if (toVisit.isEmpty()) {
            return false;
        }
        TreeNode input = toVisit.remove();
        if (input.value == value) {
            return true;
        } else {
            if (input.left  != null)  toVisit.add(input.left);
            if (input.right != null)  toVisit.add(input.right);
            return breadthFirstSearch(value, toVisit);
        }
    }

    public boolean depthFirstSearch(String value) {
        Stack<TreeNode> toVisit = new Stack<>();
        toVisit.push(headOfTree);
        return depthFirstSearch(value, toVisit);
    }

    private boolean depthFirstSearch(String value, Stack<TreeNode> toVisit) {
        if (toVisit.isEmpty()) {
            return false;
        }
        TreeNode input = toVisit.pop();
        if (input.value == value) {
            return true;
        } else {
            if (input.left  != null)  toVisit.push(input.left);
            if (input.right != null)  toVisit.push(input.right);
            return depthFirstSearch(value, toVisit);
        }
    }

}
