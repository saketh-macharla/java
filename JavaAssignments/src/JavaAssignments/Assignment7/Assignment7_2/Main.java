package JavaAssignments.Assignment7.Assignment7_2;

public class Main {
    public static void main(String[] args) {
        Cycle[] cycle = new Cycle[3];
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        cycle[0]=unicycle;
        cycle[1]=bicycle;
        cycle[2]=tricycle;

        System.out.println("Upcasted & calling balance method");
        for(Cycle c: cycle){
            c.balance();
        }
        System.out.println("Downcast & calling balance method");
        Unicycle uni=(Unicycle) cycle[0];
        Bicycle bi=(Bicycle) cycle[1];
        Tricycle tri=(Tricycle) cycle[2];
        uni.balance();;
        bi.balance();
        tri.balance();

    }
}
