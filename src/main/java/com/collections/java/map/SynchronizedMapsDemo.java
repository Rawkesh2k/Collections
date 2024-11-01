package com.collections.java.map;

import com.sun.source.tree.SynchronizedTree;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedMapsDemo {
    public static void main(String[] args) throws InterruptedException {
        //creating a synchronized map

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");

        //converting to a synchronized map
        Map<Integer, String> syncMap = Collections.synchronizedMap(map);
        System.out.println(syncMap);
        //iterating over the map
        Iterator<Map.Entry<Integer, String>> it = syncMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> next = it.next();
            System.out.println("Key = " + next.getKey() + " & Value = " + next.getValue());
        }

        //concurrent hashmap
        //concurrent hashmap never throws ConcurrentModificationException
        ConcurrentHashMap<Integer, String> cmap = new ConcurrentHashMap<>();
        cmap.put(1, "Sachin");
        cmap.put(2, "Bradman");
        cmap.put(3, "McGrath");
        cmap.put(4, "Virat");

        System.out.println(cmap.get(1));


        MultiThreadDemo threadDemo = new MultiThreadDemo();

        //Daemon Thread - a background and non-user thread
        threadDemo.setDaemon(true);
        threadDemo.start();
        //threadDemo.join(); //--> Waits for this thread to terminate.
        threadDemo.join(3000);//the thread will be paused for 3 seconds before next thread in line begins

        MultiTthreadWithRunnable withRunnable = new MultiTthreadWithRunnable();
        Thread thread2 = new Thread(withRunnable);
        //thread2.setDaemon(true);
        thread2.start();
       //Throwing runtime exception
        System.out.println(1 / 0);

    }
}
