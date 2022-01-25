package JavaAssignments.Assignment7.Assignment7_1;

public class Hamster extends Rodent{

    Hamster(){
        System.out.println("This is Hamster Class Object");
    }

    @Override
    void eat() {
        System.out.println("all hamster's eat seeds, grains, nuts, cracked corn, fruits and vegetables. Wild hamsters also eat insects, frogs, lizards and other small animals");
    }

    @Override
    void walk() {
        System.out.println("all hamster can walk and run most of the time");
    }
}
