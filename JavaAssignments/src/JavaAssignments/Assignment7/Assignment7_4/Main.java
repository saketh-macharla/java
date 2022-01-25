package JavaAssignments.Assignment7.Assignment7_4;

public class Main {
    public static void main(String[] args) {
        CycleFactory cycleFactory = new CycleFactory();

        //get obj of unicycle and call cycleWheels
        Cycle uniCycle= cycleFactory.getCycle("UniCycle");
        uniCycle.cycleWheels();

        //get obj of Bicycle and call cycleWheels
        Cycle biCycle= cycleFactory.getCycle("bicycle");
        biCycle.cycleWheels();

        //get obj of Tricycle and call cycleWheels
        Cycle triCycle= cycleFactory.getCycle("tricycle");
        triCycle.cycleWheels();

    }
}
