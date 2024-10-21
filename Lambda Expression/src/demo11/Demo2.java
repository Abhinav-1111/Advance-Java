package demo11;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.PopulateEmployee();
        List<String > nameList = GeneratorUtil.PopulateNames(employeeList);

        System.out.println("Sort by name");
        Collections.sort(nameList, (o1, o2) -> o1.compareTo(o2));
        for (String name : nameList){
            System.out.println(name);
        }
    }
}
