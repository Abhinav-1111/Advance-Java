package demo1;

public class Test1 {
    public static void main(String[] args) {
        // Create an Object of operation
        Operation operation = new OperationImpl();

        // Invoke increment method and save output in result variable
        int result = operation.increment(0);

        // print result variable
        System.out.println(result);


    }
}
