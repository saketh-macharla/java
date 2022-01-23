package Section6;

public class CountDown {
    public static void main(String[] args) {
        countUpTo(20,30);
    }
    static void countDownFrom(int intialCount){
        if(intialCount>0){
            System.out.println(intialCount);
            countDownFrom(intialCount-1);
        }
    }
    static void countUpTo(int starting,int Ending){
        if(starting!=Ending){
            System.out.println(starting);
            countUpTo(starting+1,Ending);
        }
    }
}
