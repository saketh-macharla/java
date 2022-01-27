package JavaAssignments.Assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;


public class FileSearch {
    public static void fileSearch(File file, String reg){
        for(File f:file.listFiles()){
            if(f.isDirectory()){
                fileSearch(f,reg);
            }
            boolean match= Pattern.matches(reg,f.getName());
            if(match) {
                System.out.println("File " + reg + " found at " + f.getAbsolutePath());
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("/home/saketm/");
        System.out.println("Enter the regular expression i.e file to search");
        String reg= sc.nextLine();
        while(!reg.equals("")){
            fileSearch(file,reg);
            System.out.println("Enter the regular expression i.e file to search");
            reg= sc.nextLine();
        }
    }
}
