package com.collections.java.map;

import java.util.*;

public class HashMapToArrayList {
    public static void main(String[] args) {

        //Create a hashmap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Adam");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        map.put(4, "Damian");

        //With JDK 1.8
        map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));

        //iteration
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println("Key = " + next.getKey() + " & Value = " + next.getValue());
        }

        //when we observe, array list can have either keys or values from the map
        //if we want both, we need to create two array lists

        //converting keys to array list
        ArrayList<Integer> listOfKeys = new ArrayList<>(map.keySet());
        for (int keys : listOfKeys) {
            System.out.println(" -- " + keys + " -- ");
        }

        //converting values to array list
        ArrayList<String> listOfValues = new ArrayList<>(map.values());
        for (String vals : listOfValues) {
            System.out.println(" -- " + vals + " -- ");
        }
    }
}
