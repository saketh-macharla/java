package Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Project8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> c = new ArrayList<>();
        int radius;
        try {
            Scanner circle = new Scanner(new File("circles_data.txt"));
            while(circle.hasNext()) {
                radius = circle.nextInt();
                c.add(new Circle(radius));
            }
            circle.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            PrintWriter pr =new PrintWriter("circles_output.txt");
            for (Circle cir : c) {
                System.out.println("Radius of circle "+cir.getRadius());
                System.out.println("Area of Circle is "+String.format("%.2f",cir.area()));
                System.out.println("Circumference of Circle is "+String.format("%.2f",cir.circumference()));
                System.out.println();
                pr.println("Radius of circle "+cir.getRadius());
                pr.println("Area of Circle is "+String.format("%.2f",cir.area()));
                pr.println("Circumference of Circle is "+String.format("%.2f",cir.circumference()));
                pr.println();

            }
            pr.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
