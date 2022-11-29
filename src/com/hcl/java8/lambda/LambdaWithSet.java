package com.hcl.java8.lambda;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class LambdaWithSet {

    public static void main(String...args) {

        Set < String > courses = new HashSet < String > ();
        courses.add("Java");
        courses.add("C");
        courses.add("C++");
        courses.add("Python");
        courses.add("Scala");

        // JDK 8 streaming example lambda expression
        courses.stream().forEach(course -> coursePrinter(course));

        // JDK 8 streaming example method reference
        courses.stream().forEach(LambdaWithSet::coursePrinter);

        // JDK 8 for each with lambda
        courses.forEach(course -> coursePrinter(course));

        // JDK 8 for each
        courses.forEach(LambdaWithSet::coursePrinter);
    }

    // common method to print course
    private static void coursePrinter(String course) {
        System.out.println("course name :: " + course);
    }
}