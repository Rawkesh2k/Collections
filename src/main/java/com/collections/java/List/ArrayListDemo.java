package com.collections.java.List;

import java.util.ArrayList;

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
        System.out.println("Printing the list as an array: "+list);

        //get an element
        System.out.println("Fetching an element at an index: "+list.get(3));

        //get size

        System.out.println("Printing the size of the list: "+list.size());

        //Virtual Capacity Concept

    }


}
