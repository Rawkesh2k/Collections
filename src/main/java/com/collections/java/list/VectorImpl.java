package com.collections.java.list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorImpl {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();

        //adding elements
        list.add(45);
        list.add(465);
        list.add(5);
        list.add(495);
        list.add(65);
        list.add(3);
        list.add(8);
        list.add(888);
        list.add(-9);
        list.add(-68);
        list.add(91);
        list.add(34);
        System.out.println(list);

        //removing elements
        list.remove(5);
        System.out.println(list);

        Vector<Integer> list2 = new Vector<>();
        list.add(0);
        list.add(00);
        list.add(0);
        list.add(000);
        list.addAll(list2);
        System.out.println(list);

        //Iteration
        //for each loop
        for (int i : list) {
            System.out.println(i);
        }
        //iterator

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Using enumerator
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Enumeration<String> enumeration = fruits.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        //for the list above
        Enumeration<Integer> en = list.elements();
        while(en.hasMoreElements())
        {
            System.out.println(" || ");
            System.out.println(en.nextElement());
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
        ;
    }
}
