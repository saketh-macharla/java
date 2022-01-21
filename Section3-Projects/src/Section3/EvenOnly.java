package Section3;

public class EvenOnly {
    public static void main(String[] args) {
        int count=-1;
        while(count<=10){
            count+=1;
            if(count%2!=0){
                continue;
            }
            System.out.print(count+"\t");
        }
    }
}
