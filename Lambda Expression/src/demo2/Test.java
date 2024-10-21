package demo2;

public class Test {
    public static void main(String[] args) {
        Operation operation = new OperationImpl();

        boolean result = operation.isPositive(4);

        System.out.println(result);
    }
}
