public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty())
            return 0;
        else if (numbers.contains(",")) {
            String[] split = numbers.split(",");
            return Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
        }
        else
            return Integer.parseInt(numbers);
    }
}
