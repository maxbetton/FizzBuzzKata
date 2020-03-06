import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringCalculator {
    private StringCalculator stringCalculator = new StringCalculator();


    @Test
    void shouldReturnEmptyString() {
        Assertions.assertEquals("",stringCalculator.add(""));
    }
}
