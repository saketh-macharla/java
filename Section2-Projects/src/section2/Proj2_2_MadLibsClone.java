package section2;

import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        String adjective;
        String gname;
        String anotherAdj;
        String occ;
        String place;
        String cloth;
        String hobby;
        String anAdj;
        String anotherOcc;
        String bname;
        String mname;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Adjective: ");
        adjective=sc.nextLine();
        System.out.print("Enter a girl's name: ");
        gname=sc.nextLine();
        System.out.print("Enter another adjective: ");
        anotherAdj = sc.nextLine();
        System.out.print("Enter an occupation: ");
        occ= sc.nextLine();
        System.out.print("Enter the name of the place: ");
        place= sc.nextLine();
        System.out.print("Enter the name of a piece of clothing: ");
        cloth= sc.nextLine();
        System.out.print("Enter the name of the hobby: ");
        hobby=sc.nextLine();
        System.out.print("Enter another adjective: ");
        anAdj= sc.nextLine();
        System.out.print("Enter another occupation: ");
        anotherOcc=sc.nextLine();
        System.out.print("Enter a boy's name: ");
        bname=sc.nextLine();
        System.out.print("Enter a man's name: ");
        mname= sc.nextLine();

        System.out.println("There once was a "+ adjective+ " girl named "+ gname +" who was a "+anotherAdj+ " "+occ+" in the Kingdom of " +place+".");
        System.out.println("She loved to wear "+cloth+ " and to "+hobby+". She wanted to marry the "+anAdj+" "+anotherOcc+" named "+bname+" but her father, King "+mname+" forbid her from seeing him.");


    }
}
