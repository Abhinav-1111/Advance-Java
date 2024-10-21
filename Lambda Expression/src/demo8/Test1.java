package demo8;

public class Test1 {
    public static void main(String[] args) {
        try {
            Operation operation = new OperationImpl();

            int result = operation.divide(10, 0);

            System.out.println(result);
        }catch (Exception exception){
            System.out.println(exception);
        }
    }
}
