package JavaAssignments.Assignment7.Assignment7_5;

public class Outer2 {
    static class Inner2 extends Outer1.Inner1{
        Inner2(String name) {
            new Outer1().super(name);
        }
    }
}
