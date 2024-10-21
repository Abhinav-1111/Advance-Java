package demo2;

public class Test2 {
    public static void main(String[] args) {
        Operation operation = new Operation(){
            @Override
            public boolean isPositive(int num) {
                return num >= 0;
            }
        };

        boolean result = operation.isPositive(4);

        System.out.println(result);
    }
}
