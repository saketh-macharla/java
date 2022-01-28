package JavaAssignments.Assignment12;


public class Student
{
    int id;
    String name;
    int age;
    String gender;
    String engineeringDepartment;
    int yearOfEnrollment;
    double percentageTillDate;
    Student(int id, String name, int age, String gender, String engineeringDepartment, int yearOfEnrollment, double percentageTillDate)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engineeringDepartment = engineeringDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.percentageTillDate = percentageTillDate;
    }
}
