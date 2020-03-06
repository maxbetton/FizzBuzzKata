import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {
        int result = 0;
        if (numbers.isEmpty())
            return 0;
        else {
            String[] split = tokenize(numbers);
            for (String string: split
            ) {
                if (Integer.parseInt(string) < 0 )
                    throw new RuntimeException("Negative not allowed : " + string);
                result += convert(string);
            }
            return result;
        }
    }

    public Integer convert(String s) {
        return Integer.parseInt(s);
    }

    private static String[] tokenize(String numbers) {
        if (numbers.startsWith("//")) {
            return splitUsingCustomDelimiter(numbers);
        }
        return splitUsingNewLineAndCommas(numbers);
    }

    private static String[] splitUsingNewLineAndCommas(String numbers) {
        String[] tokens = numbers.split(",|\n");
        return tokens;
    }

    private static String[] splitUsingCustomDelimiter(String numbers) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(numbers);
        m.matches();
        String customDelimiter = m.group(1);
        String resultNumber = m .group(2);
        return resultNumber.split(customDelimiter);
    }
}
