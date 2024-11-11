package com.collections.java.map;

import java.util.Hashtable;

public class HashTableImpl {
    public static void main(String[] args) {

        //Legacy Map and Collection
        //synchronized - hence thread safe
        //Initial capacity is 11, Load Factor is 0.75


        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(14, "N");
        map.put(11, "K");
        map.put(12, "L");
        map.put(4, "D");
        map.put(7, "G");
        map.put(10, "J");
        map.put(13, "M");
        map.put(3, "C");

        //doesn't allow null keys/values - throws null pointer exception

        //NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
        //map.put(null,"HYU");

        //Exception in thread "main"
        // java.lang.NullPointerException at java.base/java.util.Hashtable.put
        //map.put(5575, null);
        System.out.println(map);

    }
}
