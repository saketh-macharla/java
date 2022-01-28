package Lambdas.MethodReferences;


/*
for reference: https://www.infoworld.com/article/3453296/get-started-with-method-references-in-java.html

Character::new: equivalent to lambda (Character ch) -> new Character(ch)
Long::new: equivalent to lambda (long value) -> new Long(value) or (String s) -> new Long(s)
ArrayList<City>::new: equivalent to lambda () -> new ArrayList<City>()
float[]::new: equivalent to lambda (int size) -> new float[size]

 code from:
 https://www.amitph.com/java-method-and-constructor-reference/#Constructor_Reference_Example
 */


interface EmployeeEmpty {
    Employee get();
}

interface EmployeeWithName {
    Employee get(String name);
}

class Employee {
    private String name;

    Employee() {
        System.out.println("Empty Constructor");
    }

    Employee(String name) {
        System.out.println("Name Constructor");
        this.name = name;
    }

    public String toString() {
        return "name: " + name;
    }
}
public class ReferenceToConstructors {
    public static void main(String[] args) {
        EmployeeEmpty empEmpty = Employee::new;

        System.out.println("Constructor isn't called yet");
        System.out.println(empEmpty.get());

// Output
// Constructor isn't called yet
// Empty Constructor
// name: null

        System.out.println();

        EmployeeWithName empWithName = Employee::new;

        System.out.println("Constructor isn't called yet");
        System.out.println(empWithName.get("Java"));

// Output
// Constructor isn't called yet
// Name Constructor
// name: Java
    }
}