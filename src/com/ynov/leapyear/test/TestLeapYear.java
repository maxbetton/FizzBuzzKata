import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLeapYear {

    private LeapYear leapYear = new LeapYear();

    @Test
    void test2000() {
        Assertions.assertTrue(leapYear.isLeapYear(2000));
    }

    @Test
    void test2008() {
        Assertions.assertTrue(leapYear.isLeapYear(2008));
    }


    @Test
    void test2017() {
        Assertions.assertFalse(leapYear.isLeapYear(2017));
    }
}
