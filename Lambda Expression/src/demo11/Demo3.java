package demo11;

import java.util.Collections;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.PopulateEmployee();
        List<String > nameList = GeneratorUtil.PopulateNames(employeeList);

        System.out.println("Sort by name");
        Collections.sort(nameList, String::compareTo);
        for (String name : nameList){
            System.out.println(name);
        }
    }
}
