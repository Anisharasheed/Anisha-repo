package Task1;
import java.util.*;
import java.util.stream.Collectors;

public class NumberStreamOperations {
    public static void calculateAverage(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int count = (int) numbers.stream().count();
        int avg = count == 0 ? 0 : sum / count;
        System.out.println("Task 1: Average = " + avg);
    }

    public static void calculateEvenOddSum(List<Integer> numbers) {
        int evenSum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        int oddSum = numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Task 3: Even Sum = " + evenSum + ", Odd Sum = " + oddSum);
    }

    public static void findUniqueNumbers(List<Integer> numbers) {
        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Task 4: Unique Numbers = " + uniqueNumbers);
    }

    public static void findMinMax(List<Integer> numbers) {
        int maxVal = numbers.stream().max(Integer::compareTo).orElse(0);
        int minVal = numbers.stream().min(Integer::compareTo).orElse(0);
        System.out.println("Task 7: Max = " + maxVal + ", Min = " + minVal);
    }
}
