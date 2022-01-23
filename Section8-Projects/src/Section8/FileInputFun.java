package Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        int sum=0;
        try{
            infile=new Scanner(new File("input.txt"));
            int input;
            while(infile.hasNext()){
                input=infile.nextInt();
                sum+=input;
                System.out.println(input);
            }
            infile.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            System.out.println(e.getMessage());

        }
        catch(InputMismatchException ex){
            System.out.println("error reading input");
            System.out.println(ex.getMessage());
        }
        System.out.println("sum is "+sum);
    }
}
