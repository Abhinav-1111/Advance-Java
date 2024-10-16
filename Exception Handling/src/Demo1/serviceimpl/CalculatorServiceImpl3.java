package Demo1.serviceimpl;

import Demo1.service.CalculatorService;

public class CalculatorServiceImpl3 implements CalculatorService {
    @Override
    public void divide(Integer... array) {
        int quotient = 0;
        try{
            quotient = array[0] / array[1];
            System.out.println("quotient of " + array[0] + " and " + array[1] + " is " + quotient);
        }catch (ArithmeticException exception){
            System.out.println("cannot divide " + array[0] + " by " + array[1]);
        }
    }
}
