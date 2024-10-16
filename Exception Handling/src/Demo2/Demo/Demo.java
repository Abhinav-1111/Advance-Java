package Demo2.Demo;

import Demo2.service.CalculatorService;
import Demo2.serviceimpl.CalculatorServiceImpl;
import Demo2.serviceimpl.CalculatorServiceImpl1;
import Demo2.serviceimpl.CalculatorServiceImpl2;

public class Demo {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorServiceImpl2();
        System.out.println("-- SCENARIO 1 --");
        calculatorService.divide(10,2);

        System.out.println("-- SCENARIO 2 --");
        calculatorService.divide(10,0);
    }
}
