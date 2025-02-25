package Task1;
import java.util.*;

public class LinkedListOperations {
    public static void appendElement(LinkedList<String> list, String element) {
        list.addLast(element);
        System.out.println("Task 11: After appending " + element + " - " + list);
    }

    public static void iterateList(LinkedList<String> list) {
        System.out.print("Task 12: Iterating LinkedList: ");
        for (String item : list) System.out.print(item + " ");
        System.out.println();
    }

    public static void iterateFromIndex(LinkedList<String> list, int index) {
        System.out.print("Task 13: Iterating from index " + index + ": ");
        Iterator<String> it = list.listIterator(index);
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
    }

    public static void reverseIterate(LinkedList<String> list) {
        System.out.print("Task 14: Reverse Iterating: ");
        Iterator<String> revIt = list.descendingIterator();
        while (revIt.hasNext()) System.out.print(revIt.next() + " ");
        System.out.println();
    }

    public static void insertAtIndex(LinkedList<String> list, int index, String element) {
        list.add(index, element);
        System.out.println("Task 15: After inserting " + element + " at index " + index + " - " + list);
    }

    public static void addFirstLast(LinkedList<String> list, String first, String last) {
        list.addFirst(first);
        list.addLast(last);
        System.out.println("Task 16: After adding first and last - " + list);
    }

    public static void insertAtFront(LinkedList<String> list, String element) {
        list.offerFirst(element);
        System.out.println("Task 17: After inserting " + element + " at front - " + list);
    }

    public static void insertAtEnd(LinkedList<String> list, String element) {
        list.offerLast(element);
        System.out.println("Task 18: After inserting " + element + " at end - " + list);
    }

    public static void insertMultipleAtIndex(LinkedList<String> list, int index, List<String> elements) {
        list.addAll(index, elements);
        System.out.println("Task 19: After inserting elements at index " + index + " - " + list);
    }

    public static void getFirstLast(LinkedList<String> list) {
        System.out.println("Task 20: First element - " + list.getFirst() + ", Last element - " + list.getLast());
    }
}
