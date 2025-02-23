package Task1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
public class Streams {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 10, 30);
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "date");
        
        
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int count = (int) numbers.stream().count();
        int avg = count == 0 ? 0 : sum / count;
        System.out.println("Task 1: Average = " + avg);
        
        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Task 2: Uppercase List = " + upperCaseWords);
      
        int evenSum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        int oddSum = numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Task 3: Even Sum = " + evenSum + ", Odd Sum = " + oddSum);
    
        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Task 4: Unique Numbers = " + uniqueNumbers);
        
        long countA = words.stream().filter(s -> s.startsWith("a")).count();
        System.out.println("Task 5: Count of words starting with 'a' = " + countA);

        List<String> sortedAsc = words.stream().sorted().collect(Collectors.toList());
        List<String> sortedDesc = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Task 6: Ascending = " + sortedAsc + ", Descending = " + sortedDesc);
        
        int maxVal = numbers.stream().max(Integer::compareTo).orElse(0);
        int minVal = numbers.stream().min(Integer::compareTo).orElse(0);
        System.out.println("Task 7: Max = " + maxVal + ", Min = " + minVal);
    }
}



