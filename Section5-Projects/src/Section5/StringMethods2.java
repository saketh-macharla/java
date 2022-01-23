package Section5;

public class StringMethods2 {
    public static void main(String[] args) {
        String myName="john Baugh";
        String upper=myName.toUpperCase();
        String lower=myName.toLowerCase();
        int whereIsB=myName.indexOf("B");
        String lastName=myName.substring(5);
        System.out.println("upper is "+upper);
        System.out.println("lower is "+lower);
        System.out.println("B is at index "+whereIsB);
        System.out.println("last name is "+lastName);
    }
}
