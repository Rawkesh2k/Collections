package com.collections.java.list.linkedList;

public class MyOwnLinkedListImpl {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void printMyLinkedList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        MyOwnLinkedListImpl list = new MyOwnLinkedListImpl();
        Node n1 = list.new Node(10);
        list.head = n1;

        Node n2 = list.new Node(20);
        n1.next = n2;

        Node n3 = list.new Node(30);
        n2.next = n3;

        list.printMyLinkedList();
    }
}
