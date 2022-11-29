package com.hcl.java8.lambda;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class LambdaWithList {

    public static void main(String...args) {

        List < String > courses = Arrays.asList("C", "C++", "Core Java", "J2EE", "Spring", "Hibernate", "Python");

   
        // JDK 8 streaming example lambda expression
        courses.stream().forEach(course -> printCourse(course));

        // JDK 8 streaming example method reference
        courses.stream().forEach(LambdaWithList::printCourse);

        // JDK 8 for each with lambda
        courses.forEach(course -> printCourse(course));

        // JDK 8 for each
        courses.forEach(LambdaWithList::printCourse);
    }

    // common method to print course
    private static void printCourse(String course) {
        System.out.println("course name :: " + course);
    }
}
