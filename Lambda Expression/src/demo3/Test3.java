package demo3;

public class Test3 {
    public static void main(String[] args) {
        Operation operation = num -> System.out.println("You are learning java : " + num);

        operation.print(17);
    }
}
