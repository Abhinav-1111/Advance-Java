package demo12;

import java.util.*;
import java.util.function.Supplier;

public class GeneratorUtil {
    public static <E> List<E> populateEmployees(int length, Supplier<E> supplier) {
        List<E> employeeList = new ArrayList<>();
        for (int i = 0; i < length; i++)
            employeeList.add(supplier.get());
        return employeeList;
    }
}
