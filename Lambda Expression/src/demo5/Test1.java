package demo5;

public class Test1 {
    public static void main(String[] args) {
        Operation operation = new OperationImpl();

        int result = operation.divide(4,2);

        System.out.println(result);
    }
}
