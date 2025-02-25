package Task1;
import java.util.*;
import java.util.stream.Collectors;

public class StringStreamOperations {
    public static void convertToUpper(List<String> words) {
        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Task 2: Uppercase List = " + upperCaseWords);
    }

    public static void countWordsStartingWithA(List<String> words) {
        long countA = words.stream().filter(s -> s.startsWith("a")).count();
        System.out.println("Task 5: Count of words starting with 'a' = " + countA);
    }

    public static void sortWords(List<String> words) {
        List<String> sortedAsc = words.stream().sorted().collect(Collectors.toList());
        List<String> sortedDesc = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Task 6: Ascending = " + sortedAsc + ", Descending = " + sortedDesc);
    }
}
