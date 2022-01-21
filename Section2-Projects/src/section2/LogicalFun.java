package section2;

public class LogicalFun {
    static void printResultForVariousCombi(boolean isRaining,boolean isWarm){
        boolean combined=isRaining &&isWarm;
        System.out.println("is raining and warm :"+combined);
        combined=isRaining||isWarm;
        System.out.println("is raining or warm :"+combined);
        combined=!isRaining;
        System.out.println("is not raining outside :"+combined);
    }
    public static void main(String[] args) {
        boolean isRaining=true;
        boolean isWarm=false;
        printResultForVariousCombi(isRaining,isWarm);
        isRaining=true;
        isWarm=true;
        printResultForVariousCombi(isRaining,isWarm);
        isRaining=false;
        isWarm=true;
        printResultForVariousCombi(isRaining,isWarm);
        isRaining=false;
        isWarm=false;
        printResultForVariousCombi(isRaining,isWarm);

    }
}
