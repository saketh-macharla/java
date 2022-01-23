package Section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Ganesh");
        names.add("Saketh");
        names.add("akhil");
        names.add("Sandeep");
        names.add("Shirish");
        try{
            PrintWriter pr=new PrintWriter("WriteNames.txt");
            for(String i:names){
                pr.println(i);
            }
            pr.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
