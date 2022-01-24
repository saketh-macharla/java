package saketh.assignment.singleton;

public class Singleton {
    String stringVar;

    public static Singleton staticMethod(String s){
        Singleton temp= new Singleton();
        temp.stringVar=s;
        return  temp;
    }
    public  void printString(){
        System.out.println("class member stringVar: "+this.stringVar);
    }
}
