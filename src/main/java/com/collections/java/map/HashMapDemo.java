package com.collections.java.map;

import com.google.common.collect.ImmutableMap;

import java.util.*;

public class HashMapDemo {

    public static Map<String, Integer> marks = new HashMap<>();

    static {
        marks.put("A", 100);
        marks.put("B", 97);
        marks.put("C", 87);
    }

    public static void main(String[] args) {


        //Different ways to create a map

        //Using hashMap class or parent interface Map
        Map<String, String> createMap = new HashMap<>();
        HashMap<String, String> createMap2 = new HashMap<>();

        //static way: static Hashmap
        System.out.println("Map Using static call: " + HashMapDemo.marks.get("B"));

        //immutable map with single entry
        Map<String, String> clubSpain = Collections.singletonMap("Spain", "Real Madrid");
        System.out.println("One of the top football clubs in spain is: " + clubSpain.get("Spain"));
        //clubSpain.put("Ibiza","Spain");
        // --> gives Exception in thread "main" java.lang.UnsupportedOperationException if we try to modify


        //creating an empty map

        Map<Integer, String> emptyMap = Map.of();
        //emptyMap.put(1, "Namibia");
        //System.out.println(emptyMap.get(1));
        //Throws Exception in thread "main" java.lang.UnsupportedOperationException as this is an empty map

        //Using Map.ofEntries

        Map<String, Integer> mulitpleEntryMAp = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("A", 100),
                new AbstractMap.SimpleEntry<>("B", 96),
                new AbstractMap.SimpleEntry<>("C", 99),
                new AbstractMap.SimpleEntry<>("D", 93)
        );

        Iterator<Map.Entry<String, Integer>> it = mulitpleEntryMAp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> next = it.next();
            System.out.println("Key is --> " + next.getKey() + " and Value is --> " + next.getValue());
        }
        //Maps Using Guava API

        Map<String, Integer> guavaMap = ImmutableMap.of("Google", 1, "Amazon", 2, "Flipkart", 3);
        Iterator<Map.Entry<String, Integer>> guavaIT = guavaMap.entrySet().iterator();
        while (guavaIT.hasNext()) {
            Map.Entry<String, Integer> next = guavaIT.next();
            System.out.println("Key = " + next.getKey() + "Value = " + next.getValue());
        }

        //***************************************************************************//

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

        //Iteration/Traversing over a map

        //Using Iterator - over the keys
        Iterator<String> itr = capitals.keySet().iterator();
        while (itr.hasNext()) {
            String keys = itr.next();
            String values = capitals.get(keys);
            System.out.println("Key -> " + keys + " & Value -> " + values);
        }

        //Using EntrySet
        Iterator<Map.Entry<String, String>> iterator = capitals.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key is -> " + entry.getKey() + " and the Value is -> " + entry.getValue());
        }

        //Using Java 8 - Streams
        capitals.forEach((k, v) -> System.out.println("Key = " + k + " and Value = " + v));

        //remove() - to remove the elements using keys
        capitals.remove(null);
        System.out.println(capitals);


        //Comparing two or more hashmaps

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");
        map2.put(4, "D");


        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "X");
        map3.put(2, "Y");
        map3.put(3, "Z");

        //using equals() - on the basis of key-value pairs

        System.out.println(map1.equals(map2)); // --> gives true

        System.out.println(map1.equals(map3)); // --> gives false

        //compare hashmaps for the same keys using keySet()

        System.out.println(map1.keySet().equals(map2.keySet()));

        //combine/union keys using HashSet & finding the extra keys
        map2.put(5, "E");
        HashSet<Integer> keysCombined = new HashSet<>(map1.keySet());
        keysCombined.addAll(map2.keySet());
        keysCombined.removeAll(map1.keySet());
        System.out.println(keysCombined);

        //comparing maps using values

        Map<Integer, String> map4 = new HashMap<>();
        map4.put(1, "A");
        map4.put(2, "B");
        map4.put(3, "C");
        map4.put(4, "D");

        Map<Integer, String> map5 = new HashMap<>();
        map5.put(1, "A");
        map5.put(2, "B");
        map5.put(3, "C");
        map5.put(4, "D");


        Map<Integer, String> map6 = new HashMap<>();
        map6.put(1, "X");
        map6.put(2, "Y");
        map6.put(3, "Z");
        map6.put(4, "A");

        //System.out.println(map4.equals(map5));
        System.out.println("Comparing maps values -->" + map4.values().equals(map5.values()));

        //if we want the duplicates to be allowed - can go with ArrayList

        System.out.println("Comparison with Array List: " + new ArrayList<>(map4.values())
                .equals(new ArrayList<>(map5.values())));

        //if we want the duplicates not to be allowed - can go with HashSet

        System.out.println("Comparison with Hash Set: " + new HashSet<>(map4.values())
                .equals(new HashSet<>(map6.values())));


    }
}
