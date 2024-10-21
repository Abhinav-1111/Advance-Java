package demo12;

import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.populateEmployees(10, Employee::new);

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
