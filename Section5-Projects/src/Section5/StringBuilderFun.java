package Section5;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Saketh");
        sb.append(" Macharla");
        System.out.println(sb);
        sb.insert(15," CSE");
        System.out.println(sb);
        sb.replace(15,19," is a ZemosoFellow");
        System.out.println(sb);
        StringBuilder teacherName=new StringBuilder("John Baugh");
        teacherName.replace(0,4,"Dr");
        System.out.println(teacherName);
    }
}
