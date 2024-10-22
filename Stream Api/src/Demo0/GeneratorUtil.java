package Demo0;

import java.util.*;

public class GeneratorUtil {
    public GeneratorUtil() {
    }

    public static List<Employee> PopulateEmployee() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101, "Abhishek", 60));
        employeeList.add(new Employee(102, "rahul", 70));
        employeeList.add(new Employee(103, "kartik", 80));
        employeeList.add(new Employee(104, "akash", 30));
        employeeList.add(new Employee(105, "abhi", 90));
        employeeList.add(new Employee(106, "rishu", 40));

        return employeeList;
    }
}
