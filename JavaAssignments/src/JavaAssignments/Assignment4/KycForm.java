package JavaAssignments.Assignment4;


import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Calendar;
        import java.util.Date;

public class KycForm {
    private Date registrationDate;
    private Date currentDate;

    private void printRange(Date beforeDate, Date afterDate, Calendar leftBoundaryDate, int currentYear) {

        String oldResult;
        String newResult;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Calendar beforeDateCalendar = Calendar.getInstance();
        Calendar registrationDateCalendar = Calendar.getInstance();

        beforeDateCalendar.setTime(beforeDate);
        registrationDateCalendar.setTime(registrationDate);

        int beforeDateYear = beforeDateCalendar.get(Calendar.YEAR);
        int registrationDateYear = registrationDateCalendar.get(Calendar.YEAR);


        // this condition is for when current date is falling before 30 days before registration date anniversary.
        if (currentDate.before(beforeDate) || currentDate.equals(beforeDate)) {
            if (registrationDateYear == (beforeDateYear - 1) || registrationDateYear == currentYear) {
                System.out.println("No Range");
                return;
            }
            leftBoundaryDate.set(Calendar.YEAR, currentYear - 1);
            oldResult = simpleDateFormat.format(beforeDate);
            newResult = simpleDateFormat.format(afterDate);
            System.out.println(oldResult + " " + newResult);
        }

        // this condition if for when current date is falling after registration but before 30 days after
        // registration date anniversary.
        else if (currentDate.before(afterDate)) {
            oldResult = simpleDateFormat.format(beforeDate);
            newResult = simpleDateFormat.format(currentDate);
            System.out.println(oldResult + " " + newResult);
        }

        // this is for when current date is falling after 30 days of registration day anniversary.
        else {
            oldResult = simpleDateFormat.format(beforeDate);
            newResult = simpleDateFormat.format(afterDate);
            System.out.println(oldResult + " " + newResult);
        }

    }


    public void dateFormat(String registrationDate, String currentDate) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar leftBoundaryDate = Calendar.getInstance();
        Calendar rightBoundaryDate = Calendar.getInstance();

        leftBoundaryDate.setTime(simpleDateFormat.parse(registrationDate));
        this.registrationDate = leftBoundaryDate.getTime();

        rightBoundaryDate.setTime(simpleDateFormat.parse(currentDate));
        this.currentDate = rightBoundaryDate.getTime();

        int currentYear = rightBoundaryDate.get(Calendar.YEAR);

        //Base Case : when current date is before 1st anniversary or within same year of sign up.
        if (rightBoundaryDate.get(Calendar.YEAR) - 1900 == leftBoundaryDate.get(Calendar.YEAR) - 1900) {
            System.out.println("No Range");
            return;
        }

        leftBoundaryDate.set(Calendar.YEAR, currentYear);

        // before registration date
        leftBoundaryDate.add(Calendar.DATE, -30);
        Date beforeDate = leftBoundaryDate.getTime();


        // after registration date +30 days
        leftBoundaryDate.add(Calendar.DATE, 60);
        Date afterDate = leftBoundaryDate.getTime();

        printRange(beforeDate, afterDate, leftBoundaryDate, currentYear);

    }
}