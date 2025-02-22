package Task1;
import java.util.*;
public class Generic {

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        System.out.println("Task 1: Arrays equal? " + compareArrays(arr1, arr2));

      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Task 2: Sum of even & odd: " + sumEvenOdd(numbers));

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        System.out.println("Task 3: Index of 'banana': " + findIndex(words, "banana"));

        System.out.println("Task 4: Reversed list: " + reverseList(words));

        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        System.out.println("Task 5: Merged list: " + mergeLists(list1, list2));
    }

    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

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

    public static <T> int findIndex(List<T> list, T target) {
        return list.indexOf(target);
    }

    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> merged = new ArrayList<>();
        int size = Math.max(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            if (i < list1.size()) merged.add(list1.get(i));
            if (i < list2.size()) merged.add(list2.get(i));
        }
        return merged;
    }
}


