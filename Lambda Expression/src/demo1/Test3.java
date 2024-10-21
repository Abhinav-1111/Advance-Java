package demo1;

public class Test3 {
    public static void main(String[] args) {
        // Create an Object of operation
        Operation operation = num -> ++num;  // Lambda Expression

        // Invoke increment method and save output in result variable
        int result = operation.increment(11);

        // print result variable
        System.out.println(result);


    }
}
