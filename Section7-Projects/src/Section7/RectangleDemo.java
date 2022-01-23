package Section7;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(5,10);
        System.out.println(Rectangle.getNumRectangles());
        Rectangle r3;
        System.out.println("after r3 declared "+Rectangle.getNumRectangles());
        r3=new Rectangle(2.3,3.5);
        System.out.println("after r3 instantiated "+Rectangle.getNumRectangles());

        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());
        System.out.println(r1.perimeter());
    }
}
