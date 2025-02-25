package Task1;
import java.util.*;

public class ArrayListOperations {
    public static void displayList(List<String> list) {
        System.out.println("Task 1: Colors - " + list);
    }

    public static void iterateList(List<String> list) {
        System.out.print("Task 2: Iterating: ");
        for (String item : list) System.out.print(item + " ");
        System.out.println();
    }

    public static void insertElement(List<String> list, int index, String element) {
        list.add(index, element);
        System.out.println("Task 3: After inserting " + element + " - " + list);
    }

    public static void getElement(List<String> list, int index) {
        System.out.println("Task 4: Element at index " + index + " - " + list.get(index));
    }

    public static void updateElement(List<String> list, int index, String element) {
        list.set(index, element);
        System.out.println("Task 5: After updating index " + index + " - " + list);
    }

    public static void removeElement(List<String> list, int index) {
        list.remove(index);
        System.out.println("Task 6: After removing index " + index + " - " + list);
    }

    public static void containsElement(List<String> list, String element) {
        System.out.println("Task 7: Contains '" + element + "'? " + list.contains(element));
    }

    public static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("Task 8: Sorted List - " + list);
    }

    public static void copyList(List<String> list) {
        List<String> copiedList = new ArrayList<>(list);
        System.out.println("Task 9: Copied List - " + copiedList);
    }

    public static void shuffleList(List<String> list) {
        Collections.shuffle(list);
        System.out.println("Task 10: Shuffled List - " + list);
    }
}
