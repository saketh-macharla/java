package JavaAssignments.Assignment8;

public class Main {
    public static void main(String[] args) {
        ExceptionClass e = new ExceptionClass();
        try{
            e.throwExceptions();
        }
        catch (Exception ex){
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
        /*
        finally block is executed even if NullPointerException is throwed
         */
    }
}
