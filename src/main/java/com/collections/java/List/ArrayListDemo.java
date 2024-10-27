package com.collections.java.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        //Declaration

        //This is a generic declaration, meaning, any type of data can be added/removed.
        //be it integers, strings, booleans etc
        ArrayList<Object> list = new ArrayList<Object>(15);

        //adding elements
        list.add(1);
        list.add("sports");
        list.add(true);
        list.add('c');


        //prints as an array
        System.out.println("Printing the list as an array: " + list);

        //get an element
        System.out.println("Fetching an element at an index: " + list.get(3));

        //get size

        System.out.println("Printing the size of the list: " + list.size());

        //Virtual Capacity Concept

        //The initial virtual capacity of an array list is 10 backed by an array
        // meaning array list is essentially an array in the background with size being dynamic

        //The physical capacity will look the same as we expect it to be
        // as below(initially will be 0 and grows or shrinks as we add or remove)
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(3);

        //iteration

        //using for each loop
        for (int i : nums) {
            System.out.println(i);
        }
        System.out.println("------");
        //using for loop
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        System.out.println("------");
        //using lambda function with streams
        nums.stream().forEach(i -> System.out.println(i));

        System.out.println("------");
        //using iterator

        Iterator<Integer> it = nums.iterator();
        System.out.println("Using iterator");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
