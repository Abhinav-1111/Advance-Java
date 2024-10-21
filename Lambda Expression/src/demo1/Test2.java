package demo1;

public class Test2 {
    public static void main(String[] args) {
        // Create an Object of operation
        Operation operation = new Operation() { // Anonymous inner class
            @Override
            public int increment(int num) {
                return ++num;
            }
        };

        // Invoke increment method and save output in result variable
        int result = operation.increment(101);

        // print result variable
        System.out.println(result);


    }
}
