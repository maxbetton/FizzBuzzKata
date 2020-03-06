import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringCalculator {
    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    void shouldReturnEmptyString() {
        Assertions.assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void shouldReturnOne() {
        Assertions.assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    void shouldReturnSumOnTwoNumbersDelimitedByComma() {
        Assertions.assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    void shouldReturnSumMultipleNumber() {
        Assertions.assertEquals(6, stringCalculator.add("1,2,3"));
    }
}
