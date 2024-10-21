package demo4;

import java.time.LocalDateTime;

public class OperationImpl implements Operation{
    @Override
    public LocalDateTime generate() {
        return LocalDateTime.now();
    }
}
