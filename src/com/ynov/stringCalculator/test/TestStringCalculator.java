import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

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

    @Test
    void shouldAcceptNewLineAsValidDelimiter() {
        Assertions.assertEquals(6, stringCalculator.add("1,2\n3"));
    }

    @Test
    void shouldAcceptCustomDelimiter() {
        Assertions.assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

    @Test
    void shouldRaiseExceptionOnNegative() {
        try {
            stringCalculator.add("-1,2,3");
            fail("Negative not allowed");
        } catch (RuntimeException e) {
            //o
        }
    }
}
