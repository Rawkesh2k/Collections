package com.collections.java.stack;

public class StackImpl {

    //our own implementation of stack

    int size;
    int arr[];
    int top;

    StackImpl(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    //to check whether the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    //to check whether the stack is full
    public boolean isFull() {
        return (size - 1 == top);
    }
    //peek() - to check the top element - no altering just checking


    public static void main(String[] args) {

    }
}
