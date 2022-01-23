package Section6;

public class MethodDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);
        int result=giveMe10();
        System.out.println(result);
        result=addThese(3,5);
        System.out.println(result);
        double dResult=square(5);
        System.out.println(dResult);
    }
    public static void printHello()
    {
        System.out.println("Hello there!");
    }
    public  static void printNumber(int n)
    {
        System.out.println("the number is "+n);
    }
    public static int giveMe10()
    {
        return 10;
    }
    public static int addThese(int a,int b)
    {
        return a+b;
    }
    public  static double square(double num)
    {
        return num*num;
    }
}
