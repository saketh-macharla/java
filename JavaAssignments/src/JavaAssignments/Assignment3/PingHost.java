package JavaAssignments.Assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class PingHost {
    static void commandEnter(ArrayList<String> command, int maxi)throws  Exception{
        ProcessBuilder p=new ProcessBuilder(command);
        Process process=p.start();
        BufferedReader input=new BufferedReader(new InputStreamReader(process.getInputStream()));
        String s=null;
        Double median;
        int len=maxi;
        double[] time=new double[maxi];
        input.readLine();
        while(maxi>0 && (s= input.readLine())!=null){
            maxi--;
            System.out.println(s);
            time[maxi]=Double.parseDouble(s.split(" ")[7].split("=")[1]);
        }
        Arrays.sort(time);
        maxi=len;
        if(maxi%2==0){
            int mid=maxi/2;
            median=(time[mid]+time[mid+1])/2;
            System.out.println("Median time is: "+median);
        }
        else{
            median= time[(int)(maxi/2)];
            System.out.println("Median time is : "+median);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        String url;
        ArrayList<String> command=new ArrayList<>();
        System.out.println("Enter website url to ping");
        url=scanner.nextLine();
        command.add("ping");
        command.add(url);
        commandEnter(command,5);
    }

}
