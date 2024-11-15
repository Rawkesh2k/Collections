package com.collections.java;

import java.util.random.RandomGenerator;

public class Java17Features {

    //Sealed Classes

    //Sealed classes allow you to restrict which classes can extend or implement them.
    // This provides a controlled class hierarchy, which can be useful for
    // domain modeling where you want to limit how your data can be represented.


    // Sealed class
    public sealed class Shape permits Circle, Square {
        public void draw() {
            System.out.println("Drawing shape");
        }
    }

    // Subclassing only allowed for Circle and Square
    public final class Circle extends Shape {
        public void draw() {
            System.out.println("Drawing circle");
        }
    }

    public final class Square extends Shape {
        public void draw() {
            System.out.println("Drawing square");
        }
    }

    /*public class Triangle extends Shape { // Error: Triangle cannot extend Shape
        public void draw() {
            System.out.println("Drawing triangle");
        }
    }*/


    public static void main(String[] args) {
        //Enhanced switch Expressions

        // Traditional switch statement

        int dayOfWeek = 2;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        //Enhanced switch expression - no need to use 'break' statement
        String weekDay = switch (dayOfWeek) {
            case 1 -> "Saturday";
            case 2 -> "Sunday";
            default -> "Invalid Day";
        };
        System.out.println(weekDay);

        //Random Number Generators

        RandomGenerator rg = RandomGenerator.getDefault();
        System.out.println(rg.nextInt());
    }
}
