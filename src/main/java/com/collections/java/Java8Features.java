package com.collections.java;

import java.util.Arrays;
import java.util.List;

public class Java8Features {

    //Default Methods
    //Interfaces can now have default methods with implementations.
    // This allows developers to add new methods to interfaces without breaking existing implementations.
    interface MyInterface {
        default void defaultMethod() {
            System.out.println("Default Method");
        }
    }

    public static void main(String[] args) {
        //Lambda Expressions

        List<String> names = Arrays.asList("Adam", "Benny", "Chad", "Dennis", "Elgar", "Freddie", "Gregory");
        names.stream().forEach((name -> System.out.println(name)));

        //Streams API

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().filter(n -> n % 2 == 0).forEach(nums -> System.out.println(nums));
        //sout can lasso be used as 'System.out::println'




    }
}
