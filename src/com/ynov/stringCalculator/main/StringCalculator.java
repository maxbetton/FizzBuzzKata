public class StringCalculator {

    public int add(String numbers) {
        int result = 0;
        if (numbers.isEmpty())
            return 0;
        else if (numbers.contains(",")) {
            String[] split = numbers.split(",");
            for (String string: split
            ) {
                result += convert(string);
            }
            return result;
        }
        else
            return convert(numbers);
    }

    public Integer convert(String s) {
        return Integer.parseInt(s);
    }

}
