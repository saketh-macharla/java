package Section3;

import java.util.Scanner;

public class Project3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int packageNumber;
        int howManyCourses;
        int baseCost;
        int costPerformance;
        int numIncluded;
        int totalCost;


        System.out.println("Which of the packages do you want? 1,2,3 ?");
        packageNumber= sc.nextInt();
        System.out.println("How many courses did you purchase");
        howManyCourses=sc.nextInt();

        if(packageNumber == 1){
            baseCost=10;
            costPerformance=6;
            numIncluded=2;
        }
        else if(packageNumber == 2){
            baseCost=12;
            costPerformance=4;
            numIncluded=4;
        }
        else{
            baseCost=15;
            costPerformance=3;
            numIncluded=6;
        }

        if(howManyCourses > numIncluded){
            totalCost=baseCost + (howManyCourses - numIncluded)*costPerformance;
        }
        else{
            totalCost=baseCost;
        }
        System.out.println("Total cost: "+totalCost);
    }
}
