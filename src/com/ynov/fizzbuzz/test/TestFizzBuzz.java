package com.ynov.fizzbuzz.test;

import com.ynov.fizzbuzz.main.FizzBuzz;
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
    public void testFizz() {
        Assertions.assertEquals("Fizz",fizzBuzz.check(3));
    }

    @Test
    public void testBuzz() {
        Assertions.assertEquals("Buzz",fizzBuzz.check(5));
    }

    @Test
    public void testFizzBuzz() {
        Assertions.assertEquals("FizzBuzz",fizzBuzz.check(15));
    }
}
