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
    public int peek() {
        if (!this.isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    //push() - adding elements into the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else if (!isFull()) {
            top = top + 1;
            arr[top] = element;
            System.out.println("The pushed element is -> " + element);
        }
    }

    //pop() - fetch the top value
    public int pop() {
        if (!isEmpty()) {
            int returnTop = top;
            top--;
            System.out.println("The popped element is -> " + arr[returnTop]);
            return arr[returnTop];
        } else {
            System.out.println("The stack is empty");
            return -1;
        }
    }

    public static void main(String[] args) {

    }
}
