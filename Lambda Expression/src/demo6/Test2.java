package demo6;

public class Test2 {
    public static void main(String[] args) {
        Operation operation = new OperationImpl(){
            @Override
            public boolean isGreater(int num1, int num2) {
                return num1 > num2;
            }
        };

        boolean result = operation.isGreater(5,4);

        System.out.println(result);
    }
}
