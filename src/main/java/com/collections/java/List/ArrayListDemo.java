package com.collections.java.List;

import java.util.*;
import java.util.stream.Collectors;

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

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(6756);
        nums2.add(72);
        nums2.add(12672);
        nums2.add(3423567);
        nums2.add(23467);
        nums2.add(1267);
        nums2.add(1267);
        //getting an element
        //The below line gives "Index -1 out of bounds for length 4" exception
        //System.out.println(nums.get(-1));
        System.out.println("Getting an element with index : " + nums.get(2));

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

        //Creating collections with the help of another collection

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('a', 'b', 'h', 'u'));
        System.out.println("The list of characters are: " + chars);

        //Various Methods

        //addAll() - helps to combine two collections of the same type
        nums.addAll(nums2);
        System.out.println("Combining all the elements: " + nums);
        System.out.println(nums2);

        //clone() - It is used to return a shallow copy of an ArrayList
        ArrayList<Integer> cloneNums = (ArrayList<Integer>) nums.clone();
        System.out.println("THe clone list of nums is: " + cloneNums);

        //clear() - used to remove all the elements from this list
        nums.clear();
        System.out.println("After clearing the nums list: " + nums);

        //contains() - It returns true if the list contains the specified element.
        System.out.println(nums2.contains(7));

        //indexOf() - It is used to return the index in this list of the
        // first occurrence of the specified element,
        // or -1 if the List does not contain this element.
        System.out.println(nums2.indexOf(89));

        //lastIndexOf() - It is used to return the index in this list of the last
        // occurrence of the specified element, or -1 if the list does not contain
        // this element.

        System.out.println(nums2.lastIndexOf(1267));

        //remove() - removes the element at specified index
        nums2.remove(6);

        //removeIf() - It is used to remove all the elements from the list that
        // satisfies the given predicate

        nums2.removeIf(printEven -> printEven % 2 == 0);
        System.out.println("Printing even nums from the list: " + nums2);

        //retainAll() - It is used to retain all the elements in the list that are
        // present in the specified collection.

        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Tom", "Sam", "Cam", "Zam"));
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Peter", "Bowen", "Cam", "Got"));

        System.out.println("Before retain: " + names1);
        names1.retainAll(names2);
        System.out.println("After retain: " + names1);

        //sublist() - gives a list from within the list based on index range
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 3, 5, 2, 5, 2, 5, 3, 567, 46, 46, 46, 434, 234, 23));

        System.out.println("The sublist is: " + numsList.subList(4, 7));

        //toArray() - returns an Object[]
        Object[] array1 = numsList.toArray();
        System.out.println(Arrays.toString(array1));
        for (Object ob : array1) {
            System.out.println(ob);
        }

        //Removing Duplicates from the list

        //Using LinkedHashSet
        LinkedHashSet<Integer> deleteDups = new LinkedHashSet<>(numsList);
        ArrayList<Integer> newDupsList = new ArrayList<>(deleteDups);
        System.out.println("List without duplicate numbers: "+newDupsList);

        //Using Streams API
        List<Integer> noDups = numsList.stream().distinct().collect(Collectors.toList());
        System.out.println("List without duplicate numbers: "+noDups);
        for (int nos : noDups) {
            System.out.print(nos + " - ");
        }

    }
}
