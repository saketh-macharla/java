package section2;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num;
        String name;
        String city;
        System.out.println("What is your name?");
        name=scanner.next();
        System.out.println("heloo "+name);
        int myAge;
        System.out.println("What is your Age");
        myAge=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter num");
        num=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("num multiplied by 2 " +num*2);
        System.out.println("What is your city");
        city=scanner.nextLine();
        System.out.println("City is "+city);
        System.out.println("Age is "+myAge);
    }

}
