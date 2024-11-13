package com.collections.java.stack;

import java.util.Stack;

public class StackImpl {

    //Time complexity -> O(1)
    //Follows LIFO - Last In, First Out
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
            System.out.println("The top element is - > " + arr[top]);
            return arr[top];
        } else {
            System.out.println("Nothing to Peek, Stack is empty");
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
            System.out.println("Nothing to Pop, The stack is empty");
            return -1;
        }
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl(5);
        //empty stack
        stack.peek();
        stack.pop();
        //pushing/adding elements to the stack
        stack.push(34);
        stack.push(56);
        stack.push(76);
        stack.push(57);
        stack.push(-91);
        //additional element as size is mentioned as 5
        stack.push(57);
        stack.peek();

        stack.pop();

        //Util class stack implementation
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(35);
        s.push(5224);
        s.push(0);
        //s.push(null); // null values are not allowed-> throws NullPointerException


        //iteration using for each loop
        for (int s1 : s) {
            System.out.println(s1);
        }
    }
}
