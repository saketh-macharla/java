package Section6;

import java.util.ArrayList;

public class Project6_1_SumOfElements {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> num= new ArrayList<>();
        num.add(10);
        num.add(15);
        num.add(20);
        System.out.println(sumElements(num));

    }
    static int sumElements(ArrayList<Integer> arr){
        int mysum=0;
        for(int i:arr){
            mysum+=i;
        }
        return mysum;
    }
}
