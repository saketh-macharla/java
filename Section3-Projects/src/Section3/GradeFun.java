package Section3;

import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char grade;
        System.out.println("enter a grade");
        grade = keyboard.next().charAt(0);
        switch (grade) {
            case 'A' :
            case 'a':
                System.out.println("great job");
                break;
            case 'B' :
            case 'b':
                System.out.println("good job");
                break;
            case 'C' :
            case 'c':
                System.out.println("you can do better");
                break;
            case 'D' :
            case 'd':
                System.out.println("your are getting close to failing");
                break;
            case 'F' :
            case 'f':
                System.out.println("you are failing the course");
                break;
            default :System.out.println("you have entered invalid grade");
        }
    }
}
