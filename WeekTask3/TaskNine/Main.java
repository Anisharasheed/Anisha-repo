package Task1;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 10, 30);
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "date");

        NumberStreamOperations.calculateAverage(numbers);
        StringStreamOperations.convertToUpper(words);
        NumberStreamOperations.calculateEvenOddSum(numbers);
        NumberStreamOperations.findUniqueNumbers(numbers);
        StringStreamOperations.countWordsStartingWithA(words);
        StringStreamOperations.sortWords(words);
        NumberStreamOperations.findMinMax(numbers);
    }
}
