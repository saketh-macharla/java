package Section3;

import java.util.Random;
import java.util.Scanner;

public class Project3_3_GuessNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int noOfGueses=0;
        int target= random.nextInt(100)+1;
        System.out.println("Guess the number");
        int num = scanner.nextInt();
        while(num!=target){
            noOfGueses+=1;
            if(num>target){
                System.out.println("Number is too high");
            }
            else{
                System.out.println("number is too low");
            }
            System.out.println("Guess the number");
            num = scanner.nextInt();
        }
        System.out.println("You got the guess right in "+noOfGueses);
    }
}
