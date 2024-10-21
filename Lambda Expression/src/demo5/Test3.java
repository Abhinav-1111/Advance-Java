package demo5;

public class Test3 {
    public static void main(String[] args) {
        Operation operation = (num1, num2) -> num1 / num2;

        int result = operation.divide(4,2);

        System.out.println(result);
    }
}
