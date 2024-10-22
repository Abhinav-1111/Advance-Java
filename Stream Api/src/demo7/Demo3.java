package demo7;

import java.util.*;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.populateEmployees();
        // Create a stream from given list
        // Filter employees by marks more than equal to 60
        // Print the number of filtered employees
        // Print employee before filtering, during filtering and after filtering using LogUtil.logWithSleep()
        Stream<Employee> stream = employeeList.stream();
        long start = System.currentTimeMillis();
        Stream<Employee> filteredStream = stream
                .peek(employee -> LogUtil.logWithSleep("Pre Filter  : " + employee))
                .filter(employee -> {
                    LogUtil.logWithSleep("Filtering   : " + employee);
                    return employee.getMarks() >= 60;
                })
                .peek(employee -> LogUtil.logWithSleep("Post Filter : " + employee));

        LogUtil.logWithSleep("---STREAM---");
        LogUtil.logWithSleep("Count : " + filteredStream.count());
        System.out.println(System.currentTimeMillis() - start + " milliseconds with sleep");
    }
}