package Section6;

public class MethodClass {
    public static void main(String[] args) {
        doSomething();

    }
    static void doSomething(){
        System.out.println("In do something");
        int result=getSomething();
        System.out.println(result);
    }
    static int getSomething(){
        return 100;
    }
}
