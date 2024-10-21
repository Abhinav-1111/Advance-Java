package demo1;

import java.util.function.Function;

public class Test4 {
    public static void main(String[] args) {
        Function<Integer, Integer> operation = num -> ++num;  // Lambda Expression

        int result = operation.apply(11);

        System.out.println(result);

    }
}
