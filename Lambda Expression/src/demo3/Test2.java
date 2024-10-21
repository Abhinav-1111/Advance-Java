package demo3;

public class Test2 {
    public static void main(String[] args) {
        Operation operation = new Operation(){
            @Override
            public void print(int num) {
                System.out.println("You are learning java : " + num);
            }
        };

        operation.print(17);
    }
}
