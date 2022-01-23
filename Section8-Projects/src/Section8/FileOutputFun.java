package Section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {
        PrintWriter outFile;
        try{
            outFile=new PrintWriter("output.txt");
            outFile.println("Hello");
            outFile.println("Welcome to Java Assignments");
            outFile.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
            System.out.println("File not found");
        }
    }
}
