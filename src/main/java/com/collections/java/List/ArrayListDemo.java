package com.collections.java.List;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        //Declaration

        //This is a generic declaration, meaning, any type of data can be added/removed.
        //be it integers, strings, booleans etc
        ArrayList list = new ArrayList();

        //adding elements
        list.add(1);
        list.add("sports");
        list.add(true);
        list.add('c');


        //prints as an array
        System.out.println(list);
    }


}
