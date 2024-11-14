package com.collections.java.queue;

public class QueueImplUsingArray {

    //Queue - FIFO - First In, First Out
    //Implementing our own queue ising Array

    int capacity;
    int[] queueArr;
    int front;
    int rear;
    int currentSize;

    public QueueImplUsingArray(int sizeOfQueue) {
        this.capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        queueArr = new int[capacity];
    }

    public boolean isFull() {
        if (currentSize == capacity) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (capacity == 0) {
            return true;
        }
        return false;
    }

    //This method will the element in the method
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data + " added to the queue");
        }
    }

    //This method wil remove the element  from the front of the queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty, cannot remove the element");
        } else {
            front++;
            if (front == capacity - 1) {
                System.out.println(queueArr[front - 1] + " removed from the queue");
                front = 0;
            } else {
                System.out.println(queueArr[front - 1] + " removed from the queue");
            }
            currentSize--;
        }
    }

    public static void main(String[] args) {


    }
}
