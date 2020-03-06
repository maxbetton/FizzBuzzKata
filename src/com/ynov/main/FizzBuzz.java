public class FizzBuzz {

    public static void main(String[] args) {
        // write your code here
    }

    public String check(int number) {
        if(number%3 == 0)
            return "Fizz";
        else if (number%5 == 0)
            return "Buzz";
        return String.valueOf(number);
    }
}
