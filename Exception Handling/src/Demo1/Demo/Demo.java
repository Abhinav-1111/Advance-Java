package Demo1.Demo;

import Demo1.service.CalculatorService;
import Demo1.serviceimpl.CalculatorServiceImpl;
import Demo1.serviceimpl.CalculatorServiceImpl1;
import Demo1.serviceimpl.CalculatorServiceImpl2;
import Demo1.serviceimpl.CalculatorServiceImpl3;

public class Demo {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorServiceImpl3();
        System.out.println("-- SCENARIO 1 --");
        calculatorService.divide(10,2);

        System.out.println("-- SCENARIO 2 --");
        calculatorService.divide(10,0);
    }
}
