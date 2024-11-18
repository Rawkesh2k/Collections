package com.collections.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class WhyStringAsKey {

    public static void main(String[] args) {
        HashMap<String, Long> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of records you want to enter: ");
        int inputSize = sc.nextInt();

        for (int i = 0; i < inputSize; i++) {
            System.out.println("Enter the name: ");
            String name = sc.next();
            System.out.println("Enter the phone number: ");
            long phone = sc.nextLong();
            map.put(name, phone);
        }
        System.out.println(map);

        //iterating to fetch the specific value of a key
        System.out.println("Enter the name to fetch the phone number: ");
        String toBeFetched = sc.next();

        Iterator<Map.Entry<String, Long>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (map.containsKey(toBeFetched)) {
                System.out.println(map.get(toBeFetched));
                break;
            } else {
                System.out.println("The name you entered doesn't have any record in the database, please check the name again");
                break;
            }
        }

        sc.close();
    }
}
