package Section3;

import java.util.Scanner;

public class Project3_2_DivisiblyByThree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num=scanner.nextInt();
        if(num%3==0){
            System.out.println("Divisible by three");
        }
        else{
            System.out.println("Not Divisible by three");
        }
    }
}
