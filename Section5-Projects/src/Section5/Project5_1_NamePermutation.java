package Section5;

import java.util.ArrayList;
import java.util.Scanner;

public class Project5_1_NamePermutation {
    public static void main(String[] args) {
        ArrayList<String> firstName=new ArrayList<>();
        ArrayList<String> lastName=new ArrayList<>();
        String fullName;
        Scanner scanner=new Scanner(System.in);
        int spaceIndex;
        for(int i=0;i<5;i++){
            System.out.println("Please enter "+(i+1)+"Name : ");
            fullName=scanner.nextLine();
            spaceIndex=fullName.indexOf(" ");
            firstName.add(fullName.substring(0,spaceIndex));
            lastName.add(fullName.substring(spaceIndex+1));
        }
        int count=0;
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                count++;
                System.out.println(firstName.get(i)+" "+lastName.get(j));
            }
        }
        System.out.println("no of permutations : "+count);

    }
}
