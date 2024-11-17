package com.collections.java;

import java.io.Serializable;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Java8Features {

    //Default Methods
    //Interfaces can now have default methods with implementations.
    // This allows developers to add new methods to interfaces without breaking existing implementations.
    interface MyInterface {
        default void defaultMethod() {
            System.out.println("Default Method");
        }
    }

    //Functional Interfaces

    //Functional interfaces, which are interfaces with a single abstract method.
    // Functional interfaces are the foundation of lambda expressions and
    // allow them to be used in collections, streams, and APIs

    @FunctionalInterface
    interface MyFunctionalInterface {
        void apply(String str);
    }

    public static void main(String[] args) {
        //Lambda Expressions

        List<String> names = Arrays.asList("Adam", "Benny", "Chad", "Dennis", "Elgar", "Freddie", "Gregory");
        names.stream().forEach((name -> System.out.println(name)));

        //Streams API

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().filter(n -> n % 2 == 0).forEach(nums -> System.out.println(nums));
        //sout can also be used as 'System.out::println'


        //The java.time API (New Date/Time API)
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //Optional Class

        //The Optional class was introduced as a container that may or may not contain a value.
        // It provides a way to express the absence of a value and helps reduce NullPointerExceptions.

        Optional<String> noMoreExceptions = Optional.ofNullable("no more exceptions");
        noMoreExceptions.ifPresent(System.out::println);

        //Parallel and Asynchronous Processing
        //Java 8’s Stream API introduced parallel streams, which enable parallel processing
        // without requiring developers to manually create threads.
        // This allows developers to leverage multicore processors more easily.


        //This greatly improves performance for certain types of operations,
        // such as large-scale data processing tasks, with minimal changes to the codebase
        List<Integer> nums = Arrays.asList(1, 8, 2, 3, 4, 0, 985, 1, 8, 2, 3, 4, 0, 985, 1, 8, 2, 3, 4, 0, 985, 1, 8, 2, 3, 4, 0, 985);
        nums.parallelStream().forEach(System.out::println); //order will not be preserved

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8).filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));

        //appending strings suing stream

        Stream.of("Every", "Word").map(e -> e + " Now and Then").forEach(System.out::println);

        //JDK 9 - JShell - JShell (Java Shell) is an interactive tool introduced in Java 9 that lets you quickly test and
        // execute small pieces of Java code without creating a full program.
        //Why Use JShell?
        //For Learning: Practice Java syntax and concepts interactively.
        //For Testing: Try out code or Java APIs without creating files.
        //For Debugging: Test small pieces of code to isolate issues.

        //Factory Methods for Immutable Collections - JDK 9

        List<Object> a = List.of("A", "BGAE", "FEF", "FIFA", 'f', 354, 53, 78f, 67.8902);

        a.stream().forEach(System.out::println);
        /*for (Object o:a)
        {
            System.out.println(o);
        }*/

        //JDK - 10 - 'var' keyword is used to omit the type of the variable
        var num = 45 + "RA";
        System.out.println(num);

        //JDK 12 - new switch case
        var n = 3;
        var m = switch (n) {
            case 1 -> "One";
            case 2 -> "Two";
            default -> "Default number";
        };
        System.out.println(m);
    }
}
