package JavaAssignments.Assignment7.Assignment7_1;

public class Mouse extends Rodent{
    Mouse(){
        System.out.println("This is Mouse Class Object");
    }

    @Override
    void eat() {
        System.out.println("all mice eat seeds, grains, small fruit and they are omnivores");
    }

    @Override
    void walk() {
        System.out.println("all mice can walk and run");
    }
}
