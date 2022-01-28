package Lambdas.MethodReferences;

// Java Program to Illustrate How One can use
// Static method reference
// To Sort with Custom Comparator

// Importing required classes
import java.util.*;

// Class 1
// Helper class
// Object need to be sorted
class Man {

    private String name;
    private Integer age;

    // Constructor
    public Man(String name, int age)
    {
        // This keyword refers to current instance itself
        this.name = name;
        this.age = age;
    }

    // Getter-setters
    public Integer getAge() { return age; }
    public String getName() { return name; }
}

// Class 2
// Main class
public class ReferenceToStaticMethods {

    // Method 1
    // Static method to compare with name
    public static int compareByName(Man a, Man b)
    {
        return a.getName().compareTo(b.getName());
    }

    // Method 2
    // Static method to compare with age
    public static int compareByAge(Man a, Man b)
    {
        return a.getAge().compareTo(b.getAge());
    }

    // Method 3
    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty ArrayList of user-defined type
        // List of person
        List<Man> personList = new ArrayList<>();

        // Adding elements to above List
        // using add() method
        personList.add(new Man("vicky", 24));
        personList.add(new Man("poonam", 25));
        personList.add(new Man("sachin", 19));

        /*
        Using Lambda

         Collections.sort(personList, (a, b)->{
            return ReferenceToStaticMethods.compareByName(a,b);
        });
         */


        // Using static method reference to
        // sort array by name
        Collections.sort(personList,ReferenceToStaticMethods::compareByName);

        // Display message only
        System.out.println("Sort by name :");

        // Using streams over above object of Person type
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        // Now using static method reference
        // to sort array by age
        Collections.sort(personList, ReferenceToStaticMethods::compareByAge);

        // Display message only
        System.out.println("Sort by age :");

        // Using streams over above object of Person type
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
    }
}


