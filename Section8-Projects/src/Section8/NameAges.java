package Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NameAges {
    public static void main(String[] args) {
        Scanner names,ages;
        String name,age;
        try{
            PrintWriter pr=new PrintWriter("nameages.txt");
            names=new Scanner(new File("names.txt"));
            ages=new Scanner(new File("ages.txt"));
            while(names.hasNext() && ages.hasNext()){
                name=names.nextLine();
                age=ages.nextLine();
                pr.println(name +" is "+age +" years old");
            }
            pr.close();
            names.close();
            ages.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
