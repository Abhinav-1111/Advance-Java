package demo6;

public class Test3 {
    public static void main(String[] args) {
        Operation operation = (num1, num2) -> num1 > num2;

        boolean result = operation.isGreater(5,4);

        System.out.println(result);
    }
}
