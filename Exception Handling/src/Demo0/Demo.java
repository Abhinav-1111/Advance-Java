package Demo0;

public class Demo {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorServiceImpl() ;
        System.out.println("-- SCENARIO 1 --");
        calculatorService.divide(10,2);

        System.out.println("-- SCENARIO 2 --");
        calculatorService.divide(10,0);

    }
}