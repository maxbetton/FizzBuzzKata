public class FizzBuzz {

    public static void main(String[] args) {
        // write your code here
    }

    public String check(int number) {
        String result = "";
        if(number%3 == 0)
            result+= "Fizz";
        if (number%5 == 0)
            result+= "Buzz";
        return result.length()>0?result:String.valueOf(number);
    }
}
