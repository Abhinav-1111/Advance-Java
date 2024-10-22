package demo2;

import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.populateEmployees();
        System.out.println("---ITERATE---");
        //Create a stream from given list
        //Filter employees with marks more than equal to 60
        //Print the employees
        employeeList.stream().filter(employee -> employee.getMarks() > 60).forEach(System.out::println);
    }
}
