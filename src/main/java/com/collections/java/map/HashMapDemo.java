package com.collections.java.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("New Zealand", "Auckland");
        capitals.put("Jamaica", "Kingston");
        System.out.println(capitals.get("India"));

        //returns null if there is no key
        System.out.println(capitals.get("Spain"));

        //Key can't be duplicated, but it is , it only gives the latest value
        capitals.put("India", "Indore");
        System.out.println(capitals.get("India"));

        //Adding null values
        //Can have any number of null values but only one null key
        capitals.put(null, "Warsaw");
        System.out.println(capitals.get(null));

        //Hashmap is not synchronized and hence not thread safe
        


    }
}
