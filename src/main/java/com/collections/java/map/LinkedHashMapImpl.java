package com.collections.java.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImpl {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(45, "Rohit");
        map.put(10, "Messi");
        map.put(1, "Novak");
        map.put(23, "Jordan");
        map.put(12, "Brady");
        map.put(null, "Verstappen");
        System.out.println(map);


    }
}
