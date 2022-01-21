package Section3;

import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        int age;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("welcome to pub and grille");
        System.out.println("please enter your age");
        age=keyboard.nextInt();
        if(age>=21)
            System.out.println("hear have a beer.");
        else if(age>=16)
        {
            System.out.println("here is your coke");
            System.out.println("at least you can drive");
        }
        else
            System.out.println("here have a coke");
        System.out.println("thanks for coming");
    }
}
