package demo2;

public class Test3 {
    public static void main(String[] args) {
        Operation operation =  num -> num >= 0;

        boolean result = operation.isPositive(4);

        System.out.println(result);
    }
}
