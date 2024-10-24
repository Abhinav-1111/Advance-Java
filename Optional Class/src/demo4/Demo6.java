package demo4;

import java.util.Optional;

public class Demo6 {
    public static void main(String[] args) {
        Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(60);
        System.out.println(optionalEmployee);

        /*
         * Convert optionalEmployee back to Stream and then print the value.
         */
        System.out.println("---STREAM---");
        optionalEmployee.stream().forEach(System.out::println);
    }
}
