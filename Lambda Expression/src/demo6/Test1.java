package demo6;

public class Test1 {
    public static void main(String[] args) {
        Operation operation = new OperationImpl();

        boolean result = operation.isGreater(5,4);

        System.out.println(result);
    }
}
