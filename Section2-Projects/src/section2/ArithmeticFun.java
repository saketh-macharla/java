package section2;

public class ArithmeticFun {
    public static void main(String[] args) {
        int firstNum=10;
        int secondNum=20;
        int add=firstNum+secondNum;
        float product=firstNum*secondNum;
        product*=2;
        int difference=secondNum-firstNum;
        float quotient=secondNum/firstNum;

        System.out.println(add+" "+product+" "+difference+" "+quotient);
        add++;
        System.out.println(add);
        add--;
        System.out.println(add);
    }
}
