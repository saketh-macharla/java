package JavaAssignments.Assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            Scanner demo=new Scanner(new File("input.txt"));
            PrintWriter pr=new PrintWriter("output.txt");
            Map<Character,Integer> newmap=new HashMap<>();
            char[] temp;
            while(demo.hasNext()){
                temp=demo.next().toCharArray();
                for(char i:temp){
                    if(newmap.containsKey(i))
                        newmap.put(i,newmap.get(i)+1);
                    else
                        newmap.put(i,1);
                }
            }
            demo.close();
            for(Character c:newmap.keySet()){
                pr.println(c+" : "+newmap.get(c));
            }
            pr.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
