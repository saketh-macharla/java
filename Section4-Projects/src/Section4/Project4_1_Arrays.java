package Section4;

import java.util.Scanner;

public class Project4_1_Arrays {
    public static void main(String[] args) {
        int[] arr =new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i:arr){
            System.out.println(i*2+"\t");
        }
    }
}
