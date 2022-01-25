package JavaAssignments.Assignment7.Assignment7_1;

public class Gerbil extends  Rodent{

    Gerbil(){
        System.out.println("This is Gerbil Class Object");
    }

    @Override
    void eat() {
        System.out.println("all gerbil's eat seeds of various grasses, bulbs and a range of leaves and herbs");
    }

    @Override
    void walk() {
        System.out.println("all gerbils are small, they don't need to be walked every day");
    }
}
