package JavaAssignments.Assignment2;

import java.util.Scanner;

public class AlphabetRangeChecker {

    static  boolean checker(char[] alpha){
        boolean Alpha[]= new boolean[26];
        for(char x:alpha){
            if (x >= 'A' && x <= 'Z'){
                Alpha[x-'A']=true;
            }
            else if(x >= 'a' && x<='z'){
                Alpha[x-'a']=true;
            }
        }
        int count=0;
        for (boolean x:Alpha) {
            if(x){
                count+=1;
            }
            else{
                return false;
            }
        }
        return count==26;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter String");
        s=sc.nextLine();
        System.out.println(checker(s.toCharArray()));
    }
}

/*
* Time Complexity
* O(n)
*
* Space Complexity
*O(1)    Since program takes constant space of size 26
* */
