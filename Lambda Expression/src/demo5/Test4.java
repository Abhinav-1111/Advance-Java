package demo5;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> operation = (num1, num2) -> num1 / num2;

        int result = operation.apply(4,2);

        System.out.println(result);
    }
}
