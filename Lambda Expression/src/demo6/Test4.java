package demo6;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> operation = (num1, num2) -> num1 > num2;

        boolean result = operation.test(5,4);

        System.out.println(result);
    }
}
