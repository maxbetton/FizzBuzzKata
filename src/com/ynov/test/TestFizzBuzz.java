import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestFizzBuzz {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void main() {
    }

    @Test
    public void testWithNumberOne() {
        Assertions.assertEquals("1",fizzBuzz.check(1));
    }

    @Test
    public void testWithNumberTwo() {
        Assertions.assertEquals("2",fizzBuzz.check(2));
    }

    @Test
    public void testWithNumberThree() {
        Assertions.assertEquals("Fizz",fizzBuzz.check(3));
    }

}
