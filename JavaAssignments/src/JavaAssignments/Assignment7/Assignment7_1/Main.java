package JavaAssignments.Assignment7.Assignment7_1;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[3];
        rodents[0]=new Gerbil();
        rodents[1]=new Mouse();
        rodents[2]=new Hamster();

        for(Rodent rodent: rodents){
            rodent.eat();
            rodent.walk();
            System.out.println("");
        }
    }
}
