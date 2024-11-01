package com.collections.java.map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentHashMapImpl {

    //shared map
    private static ConcurrentHashMap<String, AtomicInteger> map = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        //Initialize the map with keys and values
        map.put("A", new AtomicInteger(0));
        map.put("B", new AtomicInteger(0));
        map.put("C", new AtomicInteger(0));

        //Create threads
        Thread t1 = new Thread(new IncrementTask());
        Thread t2 = new Thread(new IncrementTask());
        Thread t3 = new Thread(new IncrementTask());
        //Start threads
        t1.start();
        t2.start();
        t3.start();

        //Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final count: ");
        map.forEach((k, v) -> System.out.println("Key -> " + k + "," + " Value -> " + v));
    }

    static class IncrementTask implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                map.get("A").incrementAndGet(); // Atomically increment the value of key "A"
                map.get("B").incrementAndGet(); // Atomically increment the value of key "B"
                map.get("C").incrementAndGet(); // Atomically increment the value of key "C"
            }
        }
    }
}


