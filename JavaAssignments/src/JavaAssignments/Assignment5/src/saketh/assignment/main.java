package saketh.assignment;

import saketh.assignment.data.JavaAssignment5;
import saketh.assignment.singleton.Singleton;

public class main {
    public static void main(String[] args) {
        JavaAssignment5 obj=new JavaAssignment5();
        obj.printVar();
        obj.printLoc();
        Singleton newObj=Singleton.staticMethod("Static method in Singleton class");
        newObj.printString();
    }
}
