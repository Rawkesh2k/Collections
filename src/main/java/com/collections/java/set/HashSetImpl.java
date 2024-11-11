package com.collections.java.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetImpl {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Alex");
        set.add("Bryan");
        set.add("Chad");
        set.add("Dennis");
        set.add(null);

        //printing the set as an array
        System.out.println(set);

        //iteration

        //using for each loop
        for (String s : set) {
            System.out.println(s);
        }

        //using for loop
        //Set in Java does not support indexing,
        // we can’t directly access elements by index like in a List
        String s[] = (String[]) set.toArray(new String[0]);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        //check if an element exist using contains()

        System.out.println(set.contains("Trevor")); //--> return boolean - in this case a 'false'

    }
}
