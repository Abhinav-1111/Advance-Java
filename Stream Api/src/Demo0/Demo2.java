package Demo0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.PopulateEmployee();
        System.out.println("---INPUT---");
        employeeList.forEach(employee -> System.out.println(employee));
//        for (Employee employee : employeeList){
//            System.out.println(employee);
//        }

        System.out.println("---OUTPUT");
        // Perform below tasks using Lambda but without using Method Reference and Stream
        // Filter only those employees whose marks are more than equal to 60
        // Sort these employees on ascending order of their names
        // Print these employees

        List<Employee> filteredList = new ArrayList<>();
        employeeList.forEach(employee -> {
            if (employee.getMarks() > 60){
                filteredList.add(employee);
            }
        });
//
//        for (Employee employee : employeeList ){
//            if (employee.getMarks() > 60){
//                filteredList.add(employee);
//            }
//        }

        Collections.sort(filteredList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        filteredList.forEach(employee -> System.out.println(employee));

//        for (Employee employee : filteredList ){
//            System.out.println(employee);
//        }

    }
}
