package Task1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        System.out.println("Task 1: Arrays equal? " + ArrayComparator.compareArrays(arr1, arr2));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Task 2: Sum of even & odd: " + NumberProcessor.sumEvenOdd(numbers));

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        System.out.println("Task 3: Index of 'banana': " + ListUtils.findIndex(words, "banana"));

        System.out.println("Task 4: Reversed list: " + ListUtils.reverseList(words));

        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        System.out.println("Task 5: Merged list: " + ListUtils.mergeLists(list1, list2));
    }
}


