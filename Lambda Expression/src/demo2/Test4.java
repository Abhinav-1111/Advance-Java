package demo2;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
//        Function<Integer, Boolean> operation = num -> num >= 0;
//
//        boolean result = operation.apply(4);


        Predicate<Integer> operation = num -> num >= 0;

        boolean result = operation.test(4);

        System.out.println(result);
    }
}
