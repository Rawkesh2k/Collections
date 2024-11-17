package com.collections.java;

//JDK 14 - 'record' keyword
record NewFeatures(String name, Integer age, String place) {

    //The record keyword in Java is a special feature introduced in Java 14
    // (as a preview feature) and made stable in Java 16. It is used to create
    // immutable data classes with minimal boilerplate code. A record is a
    // special kind of class that is designed to hold immutable data, and it
    // automatically provides implementations for common methods like equals(),
    // hashCode(), and toString()
}
