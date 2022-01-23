package Section5;

import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String fullName;
        fullName=scanner.nextLine();
        int spaceIndex=fullName.indexOf(" ");
        String firstName,lastName;
        firstName=fullName.substring(0,spaceIndex);
        lastName=fullName.substring(spaceIndex+1);
        firstName=firstName.toUpperCase();
        lastName=lastName.toLowerCase();
        System.out.println("First Name : "+firstName);
        System.out.println("last Name : "+lastName);
        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toLowerCase());

    }
}
