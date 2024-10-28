package com.collections.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    public static void main(String[] args) {

        //We dont' need any synchronization for any
        //add, remove of any elements

        //We need synchronization only to traverse through the list
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("Red");
        syncList.add("Blue");
        syncList.add("Green");
        syncList.add("Yellow");
        synchronized (syncList) {
            for (String s : syncList) {
                System.out.println(s);
            }
        }

        CopyOnWriteArrayList<Integer> nums = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 9, 8, 7, 6, 5));

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

    }
}
