package demo12;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.populateEmployees(10, () -> new Employee());

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
