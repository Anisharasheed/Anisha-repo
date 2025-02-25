package Task1;
import java.util.*;

public class NumberProcessor {
    public static <T extends Number> Map<String, Integer> sumEvenOdd(List<T> numbers) {
        int evenSum = 0, oddSum = 0;
        for (T num : numbers) {
            if (num.intValue() % 2 == 0) evenSum += num.intValue();
            else oddSum += num.intValue();
        }
        Map<String, Integer> result = new HashMap<>();
        result.put("Even", evenSum);
        result.put("Odd", oddSum);
        return result;
    }
}
