package Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        try{
            Scanner nums=new Scanner(new File("nums.txt"));
            PrintWriter pr =new PrintWriter("twice_nums.txt");
            int num;
            while(nums.hasNext()){
                num=nums.nextInt();
                pr.println(num*2);
            }
            pr.close();
            nums.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
