package Section7;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIC=new IceCream("chocolate",3,2);
        IceCream yourIC=new IceCream("strawberry",2,1);
        myIC.addTopping("nuts");
        myIC.addTopping("cherries");

        yourIC.addTopping("sprinkles");

        printIC(myIC);
        printIC(yourIC);
    }
    public static void printIC(IceCream icecream)
    {
        System.out.println(icecream.getName());
        System.out.println("cost $"+icecream.getCost());
        System.out.println("topped with:");
        icecream.printToppings();
        System.out.println();
    }
}
