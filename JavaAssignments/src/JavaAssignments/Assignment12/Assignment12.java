package JavaAssignments.Assignment12;


import java.util.*;
        import java.util.function.Supplier;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;

public class Assignment12 {
    public static void main(String[] args) {

        //If we use stream directly, we can only perform operation only once on that particular stream.
        //In Java 8, Stream cannot be reused, once it is consumed or used, the stream will be closed.
        //If we want to re-use the stream we can use Interface Supplier. It has only one method get
        //Java's functional supplier interface can be used any time a function needs to generate a result without any data passed into it.
        //In this way we can re-use stream as many times as we can using supplier interface through get method

        Supplier<Stream<Student>> streamSupplier
                = () -> Stream.of(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8)
                ,new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2)
                ,new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3)
                ,new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80)
                ,new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70)
                ,new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70)
                ,new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70)
                ,new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80)
                ,new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85)
                ,new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82)
                ,new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83)
                ,new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4)
                ,new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6)
                ,new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8)
                ,new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4)
                ,new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4)
                ,new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));


        System.out.println("Task-1");
        //task-1
        streamSupplier.get()
                .map(s->s.engineeringDepartment)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Task-2");
        //task-2
        streamSupplier.get()
                .filter(s->s.yearOfEnrollment>2018)
                .map(s->s.name)
                .forEach(System.out::println);

        System.out.println("Task-3");
        //task-3
        streamSupplier.get()
                .filter(s->s.gender.equals("Male"))
                .filter(s->s.engineeringDepartment.equals("Computer Science"))
                .forEach(s->System.out.println("id: "+s.id+", name: "+s.name+", age: "+s.age+", gender: "+s.gender+", engDepartment: "+s.engineeringDepartment +", year of enrollment: "+s.yearOfEnrollment+", percentage till date: "+s.percentageTillDate));

        System.out.println("Task-4");
        //task-4
        Map<Object, Long> maleFemaleCount=streamSupplier.get().collect(Collectors.groupingBy(s->s.gender,Collectors.counting()));
        System.out.println(maleFemaleCount);

        System.out.println("Task-5");
        //task-5
        streamSupplier.get()
                .filter(s->s.gender.equals("Male"))
                .map(s->s.age)
                .mapToInt(s->s)
                .average()
                .ifPresent(s-> System.out.println(s));
        streamSupplier.get()
                .filter(s->s.gender.equals("Female"))
                .map(s->s.age)
                .mapToInt(s->s)
                .average()
                .ifPresent(s-> System.out.println(s));

        System.out.println("Task-6");
        //task-6
        streamSupplier.get()
                .max(Comparator.comparing(s->s.percentageTillDate))
                .ifPresent(s-> System.out.println("highest student having highest percentage is "+s.name));

        System.out.println("Task-7");
        //task-7
        Map<Object,Long> countMem=streamSupplier.get()
                .collect(Collectors.groupingBy(s->s.engineeringDepartment,Collectors.counting()));
        System.out.println(countMem);

        System.out.println("Task-8");
        //task-8
        Map<String, Double> avgSalaryOfDepartments=
                streamSupplier.get().collect(Collectors.groupingBy(s->s.engineeringDepartment, Collectors.averagingDouble(s->s.percentageTillDate)));

        Set<Map.Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();

        for (Map.Entry<String, Double> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("Task-9");
        //task-9
        Optional<Student> youngestMaleEmployeeInElectronic=
                streamSupplier.get()
                        .filter(e -> e.gender.equals("Male") && e.engineeringDepartment.equals("Electronic"))
                        .min(Comparator.comparingInt(s->s.age));

        Student youngestMaleEmployeeInElectronicDepartment = youngestMaleEmployeeInElectronic.get();
        System.out.println("name: "+youngestMaleEmployeeInElectronicDepartment.name);

        System.out.println("Task-10");
        //task-10
        Map<String, Long> countMaleFemaleEmployeesInComputerScience=
                streamSupplier.get()
                        .filter(e -> e.engineeringDepartment.equals("Computer Science"))
                        .collect(Collectors.groupingBy(s->s.gender, Collectors.counting()));

        System.out.println(countMaleFemaleEmployeesInComputerScience);

    }
}