package Task1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));

        ArrayListOperations.displayList(colors);
        ArrayListOperations.iterateList(colors);
        ArrayListOperations.insertElement(colors, 0, "Yellow");
        ArrayListOperations.getElement(colors, 2);
        ArrayListOperations.updateElement(colors, 1, "Black");
        ArrayListOperations.removeElement(colors, 2);
        ArrayListOperations.containsElement(colors, "Green");
        ArrayListOperations.sortList(colors);
        ArrayListOperations.copyList(colors);
        ArrayListOperations.shuffleList(colors);

        LinkedList<String> linkedColors = new LinkedList<>(colors);
        LinkedListOperations.appendElement(linkedColors, "Purple");
        LinkedListOperations.iterateList(linkedColors);
        LinkedListOperations.iterateFromIndex(linkedColors, 2);
        LinkedListOperations.reverseIterate(linkedColors);
        LinkedListOperations.insertAtIndex(linkedColors, 2, "Cyan");
        LinkedListOperations.addFirstLast(linkedColors, "White", "Black");
        LinkedListOperations.insertAtFront(linkedColors, "Gold");
        LinkedListOperations.insertAtEnd(linkedColors, "Silver");
        LinkedListOperations.insertMultipleAtIndex(linkedColors, 3, Arrays.asList("Pink", "Orange"));
        LinkedListOperations.getFirstLast(linkedColors);
    }
}

   
