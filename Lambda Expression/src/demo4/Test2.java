package demo4;

import java.time.LocalDateTime;

public class Test2 {
    public static void main(String[] args) {
        Operation operation = new Operation(){
            @Override
            public LocalDateTime generate() {
                return LocalDateTime.now();
            }
        };

        LocalDateTime result = operation.generate();

        System.out.println(result);
    }
}