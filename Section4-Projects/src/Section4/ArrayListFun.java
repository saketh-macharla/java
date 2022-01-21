package Section4;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> nameList =new ArrayList<String>();
        nameList.add("ganesh");
        nameList.add("suresh");
        nameList.add("raju");
        for(int i=0;i< nameList.size();i++){
            System.out.println(nameList.get(i));
        }
        System.out.println("for each loop");
        for(String name:nameList){
            System.out.println(name);
        }
    }
}
