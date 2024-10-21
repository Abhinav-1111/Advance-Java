package demo5;

public class Test2 {
    public static void main(String[] args) {
        Operation operation = new Operation(){
            @Override
            public int divide(int num1, int num2) {
                return num1 / num2;
            }
        };

        int result = operation.divide(4,2);

        System.out.println(result);
    }
}
