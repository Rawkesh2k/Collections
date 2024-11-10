package com.collections.java.list.linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;

public class LinkedListImpl {
    public static void main(String[] args) {
        //Linked List is a default class in Java

        //LL can be used as a List, Stack, Queue

        //Dynamic collection - insertion adn deletion is easy

        //Allows null entry

        //Allows duplicates

        //Not thread safe/synchronized

        //Manipulation is faster in comparison to Arrays as there
        // is no data shifting/finding an element while traversing

        //constructors
        //-->Default Constructor
        //LinkedList(Collection c)

        LinkedList<String> names = new LinkedList<>();

        names.add("Aditi");
        names.add("Messi");
        names.add(null);
        names.add("Vijay");
        names.add("Lionel");

        //prints size
        System.out.println(names.size());

        //prints an array of items
        System.out.println(names);

        //iteration using for loop
        System.out.println("************    with for loop   *************");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //iteration using for each loop
        System.out.println("************    with for each loop   *************");
        for (String name : names) {
            System.out.println(name);
        }

        names.add(3, "Steve");

        //using iterator
        System.out.println("************    with iterator   *************");
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //adding a new list to existing list

        LinkedList<String> places = new LinkedList<>();
        places.add("Ooty");
        places.add("Manali");
        places.add("Araku");

        names.addAll(places);
        System.out.println(names);

        //adding element at the start
        names.addFirst("Braille");

        //adding element at the end
        names.addLast("Script");

        System.out.println(names);

        //remove elements
        names.remove(3);
        System.out.println(names);

        //removeAll(), removeFirst(), removeLast() serves the purpose as in their names

        names.removeAll(places);
        System.out.println(names);


        //clear()
        names.clear();
        System.out.println(names);

        //reverse the list using Iterator
        LinkedList<String> characters = new LinkedList<>();
        characters.add("H");
        characters.add("Y");
        characters.add("E");
        characters.add("O");
        characters.add("P");

        //sorting - using descendingIterator
        Iterator<String> reversedList = characters.descendingIterator();
        while (reversedList.hasNext())
        {
            System.out.println(reversedList.next());
        }

        //sorting - using collections
        Collections.sort(characters);
        System.out.println(characters);
    }
}
