package com.collections.java.map;

public class MultiThreadDemo extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread #1 "+i);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
