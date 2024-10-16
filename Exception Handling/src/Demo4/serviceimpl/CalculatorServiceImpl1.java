package Demo4.serviceimpl;

import Demo4.service.CalculatorService;

public class CalculatorServiceImpl1 implements CalculatorService {
    @Override
    public void divide(Integer... array) {
        int quotient = 0;
        if(array[1] == 0){
            throw new NullPointerException("cannot divide " + array[0] + " by " + array[1]);
        }
        quotient = array[0] / array[1];
        System.out.println("quotient of " + array[0] + " and " + array[1] + " is " + quotient);
    }
}
