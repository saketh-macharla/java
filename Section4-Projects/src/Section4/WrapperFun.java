package Section4;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        String pi = "3.14159";
        num.add(10);
        num.add(20);
        for (int i : num) {
            System.out.println(i);
        }
        double pival = Double.parseDouble(pi);
        System.out.println(pival);
    }
}
