package demo4;

import java.time.LocalDateTime;

public class Test1 {
    public static void main(String[] args) {
        Operation operation = new OperationImpl();

        LocalDateTime result = operation.generate();

        System.out.println(result);
    }
}
