package Section5;

public class StringMethods1 {
    public static void main(String[] args) {
        String name="Saketh Macharla";
        String name1="Saketh Macharla";
        String name3="John Baugh";
        if(name.equals(name1)){
            System.out.println("names are equal");
        }
        else {
            System.out.println("names are not equal");
        }
        if(name1.compareTo(name3)>0){
            System.out.println(name1+">"+name3);
        }
        else if(name1.compareTo(name3)<0){
            System.out.println(name1+"<"+name3);
        }
        else{
            System.out.println(name1+"="+name3);
        }
    }
}
