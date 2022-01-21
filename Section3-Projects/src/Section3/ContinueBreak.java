package Section3;

public class ContinueBreak {
    public static void main(String[] args) {
        int count=0;
        while (count<10)
        {
            if(count==5) {
                count++;
                break;
            }
            System.out.print(count+" \t");
            count++;
        }
        count=0;
        System.out.println();
        while (count<10)
        {
            if(count==5) {
                count++;
                continue;
            }
            System.out.print(count+" \t");
            count++;
        }
    }
}
