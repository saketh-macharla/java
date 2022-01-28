package Lambdas.MethodReferences;
/*

If a Lambda expression is like:

// If a lambda expression just call an instance method of a  ObjectType

(obj, args) -> obj.instanceMethod(args)

Then method reference is like:

// Shorthand if a lambda expression just call an instance method of a ObjectType

ObjectType::instanceMethod



 */
// Java Program to Illustrate how One can use
// Instance type method reference to
// sort with custom comparator

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
public class ReferenceToInstanceMethodOfStringType {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an empty ArrayList of user defined type
        // List of person
        List<String> personList = new ArrayList<>();

        // Adding elements to above object of List
        // using add() method
        personList.add("vicky");
        personList.add("poonam");
        personList.add("sachin");

        // Method reference to String type
        System.out.println("Method reference to String type");
        Collections.sort(personList,
                String::compareToIgnoreCase);

        System.out.println("Using lambda");
        System.out.println("Syntax");
        System.out.println("Collections.sort(personList,\n" +
                "                (String a, String b)->{\n" +
                "                    return a.compareToIgnoreCase(b);}");



        // Printing the elements(names) on console
        personList.forEach(System.out::println);
    }
}

