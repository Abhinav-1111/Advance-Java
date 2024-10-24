package demo0;

import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(fetchEmployeeByMarks(60));
        System.out.println(fetchEmployeeByMarks(66));
    }

    public static Employee fetchEmployeeByMarks(int marks) {
        /*
         * Fetch the list of employees using GeneratorUtil.populateEmployees(). Iterate
         * over the list. Return first employee whose marks are same as given marks.
         */
        List<Employee> employeeList = GeneratorUtil.populateEmployees();
        for (Employee employee : employeeList) {
            if (employee.getMarks() == marks)
                return employee;
        }
        return null;
    }
}
