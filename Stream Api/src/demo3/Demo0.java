package demo3;

import java.util.List;

public class Demo0 {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.populateEmployees();
        System.out.println("---COUNT---");
        // Create a stream from given list
        // Count number of employees
        // Print the number of employees
        long count = employeeList.stream().count();
        System.out.println(count);

    }
}
