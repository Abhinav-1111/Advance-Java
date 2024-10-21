package demo4;

import java.time.LocalDateTime;

public class Test3 {
    public static void main(String[] args) {
        Operation operation = () -> LocalDateTime.now();

        LocalDateTime result = operation.generate();

        System.out.println(result);
    }
}
