package Demo6;

import java.io.IOException;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public void divide(Integer... array) throws IOException {
        int quotient = 0;
        try {
            if (array[1] == 0) {
                throw new IOException("cannot divide " + array[0] + " by " + array[1]);
            }
            quotient = array[0] / array[1];
            System.out.println("quotient of " + array[0] + " and " + array[1] + " is " + quotient);
        }catch (Exception exception){
            System.out.println("Exception handled in " + this.getClass() + " is " + exception.getMessage());
            throw exception;
        }finally {
            System.out.println("print always");
        }
    }
}
