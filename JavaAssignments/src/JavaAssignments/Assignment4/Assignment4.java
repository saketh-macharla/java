package JavaAssignments.Assignment4;


import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.*;

public class Assignment4 {


    public static void main(String[] args) throws ParseException {
        KycForm kycForm=new KycForm();
        // taking input from user
        Scanner ob = new Scanner(System.in);
        System.out.println("enter number of test cases : ");
        int t = ob.nextInt();
        ob.nextLine();
        String startAndEndDates;
        for (int i = 0; i < t; i++) {
            System.out.println("enter registration date and current date");
            startAndEndDates = ob.nextLine();

            String[] dates = startAndEndDates.split(" ");

            String registrationDate = dates[0];
            String currentDate = dates[1];
            System.out.println("result : ");
            kycForm.dateFormat(registrationDate, currentDate);
        }
    }
}
