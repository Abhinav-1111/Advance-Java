package Demo1.serviceimpl;

import Demo1.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public void divide(Integer... array) {
        int quotient = 0;
        try{
            quotient = array[0] / array[1];
            System.out.println("quotient of " + array[0] + " and " + array[1] + " is " + quotient);
        }catch (ArithmeticException exception){
            exception.printStackTrace();
        }
    }
}
