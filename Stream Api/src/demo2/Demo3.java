package demo2;

import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.populateEmployees();
        System.out.println("---DISTINCT---");
        //Create a stream from given list
        //Filter distinct employees
        //Print the employees

        employeeList.stream().distinct().forEach(System.out::println);
    }
}
