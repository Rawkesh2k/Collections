package com.collections.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class WhyStringAsKey {

    //Why “String” is a popular HashMap Key in java?


    //Reason 1:

    //Hashcode:

    //When we store the data using HashMap, a hash code of the given key is calculated,
    //for example, we have given n keys in the below example with the user input

    //The hashcode is calculated and its value is placed at the position represented by the
    // resultant hash code of the key

    //Similarly while fetching the data, the hash code is again calculated,
    // by this way the value in the position represented by the hash code is retrieved.
    // Always by checking both hash code equality, the value is retrieved.

    //Other than String, if we use any other datatype and try to change the value and key,
    // stored hash value (during the storing time) and retrieved hash value (during fetching time)
    // will definitely vary and hence we cannot retrieve the apt value

    //Reason 2

    //Immutability

    //A string is immutable. We cannot modify the value of the string after it got created.
    // This is the main advantage. i.e. hashcode remains the same while storing and also during retrieval.
    // So it is a popular approach of using a String variable to hold keys in a hash map.
    //Hashcode is cached and no need to calculate again (as String immutable)
    //Immutability is a great mechanism to get same hash code every time, for a key object.
    // Hence, it is ideal to go for String as it solves memory leaks, value unavailability
    //hashCode() and equals() methods contract is playing around when data is stored in HashMap.
    // String because of immutability provides maximum support for this.


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
