package Demo3.example6;

import Demo3.entity.CustomEmployeeComparator;
import Demo3.entity.Employee;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<Employee> set= new TreeSet<>();
        set.add(new Employee(20, "Harry"));
        set.add(new Employee(10, "Tom"));
        set.add(new Employee(50, "Loki"));

        System.out.println("---Default---");
        System.out.println("Contents of set are : " + set);

        System.out.println("---SORT BY NAME---");
        Set<Employee> set2= new TreeSet<>(new CustomEmployeeComparator());
        set2.addAll(set);
        System.out.println("Contents of set are : " + set2);
    }
}
