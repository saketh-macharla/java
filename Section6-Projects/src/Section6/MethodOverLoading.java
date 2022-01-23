package Section6;

public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(getResult(4));
        System.out.println((getResult(3,4)));
        System.out.println(getResult(6,"7"));
        System.out.println(getResult("Saketh","Macharla"));

    }
    static int getResult(int num){
        return num*2;
    }
    static int getResult(int num1,int num2){
        return num1*num2;
    }
    static int getResult(int num1,String num2){
        return num1*Integer.parseInt(num2);
    }
    static String getResult(String fName,String lName){
        return fName+" "+lName;
    }
}
