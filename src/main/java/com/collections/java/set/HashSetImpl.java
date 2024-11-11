package com.collections.java.set;

import java.util.*;

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

        //removing elements with remove()
        set.remove(null); //--> removes null object
        System.out.println(set);

        //using iterator
        System.out.println("---------With ITERATOR---------");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(new Integer[]{3, 2, 16, 24, 608, 35, 32424, 646, 34}));

        Set<Integer> s2 = new HashSet<>();
        s2.addAll(Arrays.asList(new Integer[]{13, 16, 12, 6, 124, 0, 99}));

        //get the Union - combining two lists

        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println("For Union");
        System.out.println(union);

        //get the intersection
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println("For Intersection");
        System.out.println(intersection);

        //for difference
        Set<Integer> diff = new HashSet<>(s1);
        diff.removeAll(s2);
        System.out.println("For Difference");
        System.out.println(diff);

    }
}
