package section2;

import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNum, secondNum, thirdNum;
        System.out.println("Enter three numbers");
        firstNum=sc.nextDouble();
        secondNum=sc.nextDouble();
        thirdNum=sc.nextDouble();

        double avg=(firstNum+secondNum+thirdNum)/3.0;
        System.out.println("Average of three nums : " + avg);
    }
}
