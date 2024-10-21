package demo9;

import java.util.Collections;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.PopulateEmployee();

        System.out.println("Sort by name");
        Collections.sort(employeeList, CustomComparator::compareByName);
        for (Employee employee: employeeList){
            System.out.println(employee);
        }

        System.out.println("Sort by marks");
        Collections.sort(employeeList, CustomComparator::compareByMarks);
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
