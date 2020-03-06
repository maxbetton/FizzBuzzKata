public class StringCalculator {

    public int add(String numbers) {
        int result = 0;
        if (numbers.isEmpty())
            return 0;
        else if (numbers.contains(",")) {
            String[] split = numbers.split(",");
            for (String string: split
            ) {
                result += Integer.parseInt(string);
            }
            return result;
        }
        else
            return Integer.parseInt(numbers);
    }
}
