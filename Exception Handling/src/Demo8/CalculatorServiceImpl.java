package Demo8;

import Demo8.exception.ScaleUpIndiaException;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public void divide(Integer... array) throws Exception {
        int quotient = 0;
        if (array[1] == 0) {
            throw new ScaleUpIndiaException();
        }
        quotient = array[0] / array[1];
        System.out.println("quotient of " + array[0] + " and " + array[1] + " is " + quotient);

    }
}
