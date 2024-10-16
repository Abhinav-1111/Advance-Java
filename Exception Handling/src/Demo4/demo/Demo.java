package Demo4.demo;

import Demo4.service.CalculatorService;
import Demo4.serviceimpl.CalculatorServiceImpl;
import Demo4.serviceimpl.CalculatorServiceImpl1;

public class Demo {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorServiceImpl1();
        try {
            System.out.println("-- SCENARIO 1 --");
            calculatorService.divide(10,2);

            System.out.println("-- SCENARIO 2 --");
            calculatorService.divide(10,0);
        }catch (Exception exception){
            System.out.println("something went wrong " + exception);
        }
    }
}
