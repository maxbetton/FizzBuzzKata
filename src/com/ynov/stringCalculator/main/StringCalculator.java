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
            Matcher m = Pattern.compile("//(.)\n(.*)").matcher(numbers);
            m.matches();
            String customDelimiter = m.group(1);
            String resultNumber = m .group(2);
            return resultNumber.split(customDelimiter);
        }
        String[] tokens = numbers.split(",|\n");
        return tokens;
    }
}
