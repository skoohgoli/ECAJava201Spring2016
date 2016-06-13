package com.skoohgoli.java201;


public class MyLinkedList {
    public Node head;

    public MyLinkedList add(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = head.next;
            }
            last.next = node;
        }
        return this;
    }

    public Node remove(int value) {
        if (head == null) {
            return null;
        } else if (head.value == value) {
            Node temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        } else {
            Node previous = head;
            while (previous.next != null) {
                if (previous.next.value == value) {
                    previous.next = previous.next.next;
                    return new Node(value);
                }
                previous = previous.next;
            }
            return null;
        }
    }

    public Node remove(Node node) {
        if (node == null) {
            return null;
        }
        return remove(node.value);
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(new Node(1)).add(new Node(2)).add(new Node(3)).add(new Node(4));
        printList(list);

        list.remove(new Node(4));
        printList(list);

        list.remove(new Node(2));
        printList(list);

        list.remove(new Node(1));
        printList(list);

    }

    private static void printList(MyLinkedList list) {
        Node node = list.head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
}
