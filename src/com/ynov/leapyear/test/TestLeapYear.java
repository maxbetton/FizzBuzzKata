import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLeapYear {

    private LeapYear leapYear = new LeapYear();

    @Test
    void test2000() {
        Assertions.assertTrue(leapYear.isLeapYear(2000));
    }
}
