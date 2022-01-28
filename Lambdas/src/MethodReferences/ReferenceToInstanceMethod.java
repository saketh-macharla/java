package Lambdas.MethodReferences;



// Java Program to Illustrate How One can use
// Static method reference
// To Sort with Custom Comparator
// But using object method reference



/*
If a Lambda expression is like:

// If a lambda expression just call a default method of an object

(args) -> obj.instanceMethod(args)

Then method reference is like:

// Shorthand if a lambda expression just call a default method of an object

obj::instanceMethod

 */

// Importing required classes
import java.util.*;

// Class 1
// Helper class
// Object need to be sorted
class Person {

    // Attributes of a person
    private String name;
    private Integer age;

    // Constructor
    public Person(String name, int age)
    {
        // This keyword refers to current object itself
        this.name = name;
        this.age = age;
    }

    // Getter-setter methods
    public Integer getAge() { return age; }
    public String getName() { return name; }
}

// Class 2
// Helper class
// Comparator class
class ComparisonProvider {

    // Method 1
    // To compare with name
    public int compareByName(Man a, Man b)
    {
        return a.getName().compareTo(b.getName());
    }

    // Method 2
    // To compare with age
    public int compareByAge(Man a, Man b)
    {
        return a.getAge().compareTo(b.getAge());
    }
}

// Class 3
// Main class
public class ReferenceToInstanceMethod {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an empty ArrayList of user-defined type
        // List of person
        List<Man> personList = new ArrayList<>();

        // Adding elements to above object
        // using add() method
        personList.add(new Man("vicky", 24));
        personList.add(new Man("poonam", 25));
        personList.add(new Man("sachin", 19));

        // A comparator class with multiple
        // comaparator methods
        ComparisonProvider comparator
                = new ComparisonProvider();


        // to sort array by name
		/*
        Using Lambda
        Collections.sort(personList,
						(Person a, Person b)->
                         {return comparator.compareByName(a,b);});
		*/

        // Now using instance method reference
        Collections.sort(personList,
                comparator::compareByName);
        // Display message only
        System.out.println("Sort by name :");

        // Using streams
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        // Using instance method reference
        // to sort array by age
        Collections.sort(personList,
                comparator::compareByAge);

        // Display message only
        System.out.println("Sort by age :");

        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
    }
}


