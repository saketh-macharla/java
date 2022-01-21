package Section3;

public class ControlStatementsIntro {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 16)
            System.out.println("you can drive");
        else
            System.out.println("you can't drive");
        System.out.println();
        for (int i = 1; i <= age; i++) {
            System.out.println("Happy birthday " + i);
        }
    }
}
