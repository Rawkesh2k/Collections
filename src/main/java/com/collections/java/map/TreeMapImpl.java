package com.collections.java.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapImpl {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(4, "D");
        map.put(7, "G");
        map.put(3, "C");
        map.put(10, "J");
        map.put(13, "M");
        map.put(14, "N");
        map.put(11, "K");
        map.put(12, "L");
        System.out.println(map);

        //iterating tree map
        map.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        //getting last and first keys
        System.out.println(map.lastKey());
        System.out.println(map.firstKey());

        //Returns the greatest key less than or equal to the given key,
        // or null if there is no such key.
        System.out.println(map.floorKey(2));

        //Returns a view of the portion of this map whose keys are strictly less than toKey
        System.out.println(map.headMap(10).keySet());

        //Returns a view of the portion of this map whose keys are strictly greater than or equal to toKey
        System.out.println(map.tailMap(10).keySet());

        //to reverse the map

        TreeMap<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());
        map1.put(4, "D");
        map1.put(7, "G");
        map1.put(3, "C");
        map1.put(10, "J");
        map1.put(13, "M");
        map1.put(14, "N");
        map1.put(11, "K");
        map1.put(12, "L");
        System.out.println(map1);
    }
}
