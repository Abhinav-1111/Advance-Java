package demo2;

import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {
        Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(600);
        System.out.println(optionalEmployee);

        /*
         * Check if value is present in optionalEmployee, if exists then print the
         * value.
         */
        System.out.println("---IF PRESENT---");
        optionalEmployee.ifPresent(employee -> System.out.println(employee));

        /*
         * Check if value is present in optionalEmployee, if exists then print the
         * value, else print "No employee found".
         */
        System.out.println("---IF PRESENT OR ELSE---");
        optionalEmployee.ifPresentOrElse(employee -> System.out.println(employee), () -> System.out.println("No employee found"));
    }
}
