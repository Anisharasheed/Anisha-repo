package Listprog;

import java.util.ArrayList;
import java.util.List;


public class THreadArrayList extends Thread {
public static void main(String[] args) {
	List<Integer> l1=new ArrayList<>();
     l1.add(12);
     l1.add(34);
     l1.add(67);
     l1.add(90);
     l1.add(89);
     System.out.println(l1);
     
     System.out.println("The size of elements"+""+  l1.size());
     l1.add(9);
     System.out.println("The size of elements after adding an element");
     System.out.println(l1);
     System.out.println("The size of elements"+  l1.size());
     l1.remove(3);
     System.out.println(l1);
     System.out.println("After removing element");
     System.out.println("The size of elements"+ l1.size());
     
     
}
}
