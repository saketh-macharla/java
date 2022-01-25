package JavaAssignments.Assignment7.Assignment7_4;

public class CycleFactory {
    Cycle getCycle(String name){
        if (name == null){
            return null;
        }
        else if(name.equalsIgnoreCase("UniCycle")){
            return new UniCycle();
        }
        else if(name.equalsIgnoreCase("BiCycle")){
            return new BiCycle();
        }
        else if(name.equalsIgnoreCase("TriCycle")){
            return new TriCycle();
        }
        else{
            return null;
        }
    }
}
