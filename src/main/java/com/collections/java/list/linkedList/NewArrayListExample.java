package com.collections.java.list.linkedList;

import java.util.*;

public class NewArrayListExample {
    public static void main(String[] args) {
        Integer[] arr = {45, 34, 4, 24, 35, 436346, 23, 24, 23, -9, 0};

        //arrange the array in ascending order
        System.out.println("Sorting in ascending order");
        Arrays.sort(arr);
        for (Integer arrays : arr) {
            System.out.println(arrays);
        }

        //descending order

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Sorting in descending order");
        for (Integer arrays : arr) {
            System.out.println(arrays);
        }

        //other ways
        //convert the array to list
        List<Integer> list = new ArrayList<>();

        for (Integer nums:arr){
            list.add(nums);
        }

        // Sort the list in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // Sort the list in ascending order
        Collections.sort(list);
        System.out.println(list);
    }
}
