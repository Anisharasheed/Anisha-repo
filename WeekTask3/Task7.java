package Task1;
import java.util.*;
public class API {

    public static void main(String[] args) {
      
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Task 1: Colors - " + colors);
        
       
        System.out.print("Task 2: Iterating: ");
        for (String color : colors) System.out.print(color + " ");
        System.out.println();
        
       
        colors.add(0, "Yellow");
        System.out.println("Task 3: After inserting Yellow - " + colors);
        
        
        System.out.println("Task 4: Element at index 2 - " + colors.get(2));
        
       
        colors.set(1, "Black");
        System.out.println("Task 5: After updating index 1 - " + colors);
        
     
        colors.remove(2);
        System.out.println("Task 6: After removing index 2 - " + colors);
        
        
        System.out.println("Task 7: Contains 'Green'? " + colors.contains("Green"));
        
       
        Collections.sort(colors);
        System.out.println("Task 8: Sorted List - " + colors);
        
        
        List<String> copiedList = new ArrayList<>(colors);
        System.out.println("Task 9: Copied List - " + copiedList);
        
       
        Collections.shuffle(colors);
        System.out.println("Task 10: Shuffled List - " + colors);
        
        
        LinkedList<String> linkedList = new LinkedList<>(colors);
        linkedList.addLast("Purple");
        System.out.println("Task 11: After appending Purple - " + linkedList);
        
        System.out.print("Task 12: Iterating LinkedList: ");
        for (String item : linkedList) System.out.print(item + " ");
        System.out.println();
        
        System.out.print("Task 13: Iterating from index 2: ");
        Iterator<String> it = linkedList.listIterator(2);
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
        
        System.out.print("Task 14: Reverse Iterating: ");
        Iterator<String> revIt = linkedList.descendingIterator();
        while (revIt.hasNext()) System.out.print(revIt.next() + " ");
        System.out.println();
        
        linkedList.add(2, "Cyan");
        System.out.println("Task 15: After inserting Cyan at index 2 - " + linkedList);
        
        linkedList.addFirst("White");
        linkedList.addLast("Black");
        System.out.println("Task 16: After adding first and last - " + linkedList);
        
        linkedList.offerFirst("Gold");
        System.out.println("Task 17: After inserting Gold at front - " + linkedList);
        
        linkedList.offerLast("Silver");
        System.out.println("Task 18: After inserting Silver at end - " + linkedList);
        
        linkedList.addAll(3, Arrays.asList("Pink", "Orange"));
        System.out.println("Task 19: After inserting elements at index 3 - " + linkedList);
        
        System.out.println("Task 20: First element - " + linkedList.getFirst() + ", Last element - " + linkedList.getLast());
    }
}



