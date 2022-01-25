package JavaAssignments.Assignment7.Assignment7_3;

public class ImplementingClass extends  ConcreteClass implements Interface4{

    @Override
    public void m1() {
        System.out.println("This is m1 in ImplementingClass");
    }

    @Override
    public void m2() {
        System.out.println("This is m2 in ImplementingClass");
    }

    @Override
    public void m3() {
        System.out.println("This is m3 in ImplementingClass");
    }

    @Override
    public void m4() {
        System.out.println("This is m4 in ImplementingClass");
    }

    @Override
    public void m5() {
        System.out.println("This is m5 in ImplementingClass");
    }

    @Override
    public void m6() {
        System.out.println("This is m6 in ImplementingClass");
    }

    @Override
    public void m7() {
        System.out.println("This is m7 in ImplementingClass");
    }

    void InOne(Interface1 i){
        System.out.println("Interface1 reference as parameter");
    }
    void InTwo(Interface2 i){
        System.out.println("Interface2 reference as parameter");
    }
    void InThree(Interface3 i){
        System.out.println("Interface3 reference as parameter");
    }
    void InFour(Interface4 i){
        System.out.println("Interface4 reference as parameter");
    }
}
