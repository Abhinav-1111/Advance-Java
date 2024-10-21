package demo10;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.PopulateEmployee();
        CustomComparator customComparator = new CustomComparator();

        System.out.println("Sort by name");
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return customComparator.compareByName(o1, o2);
            }
        });
        for (Employee employee: employeeList){
            System.out.println(employee);
        }

        System.out.println("Sort by marks");
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return customComparator.compareByMarks(o1, o2);
            }
        });
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
