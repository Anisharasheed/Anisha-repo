package Listprog;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ThreadVector extends Thread {
public void run() {
	List<Integer> l2= new Vector();
	l2.add(67);
    l2.add(56);
    l2.add(65);
    l2.add(94);
    l2.add(100);
    System.out.println(65);
    
    System.out.println("The size of elements"+""+  l2.size());
    l2.add(9);
    System.out.println("The size of elements after adding an element");
    System.out.println(l2);
    System.out.println("The size of elements"+  l2.size());
    l2.remove(2);
    System.out.println(l2);
    System.out.println("After removing element");
    System.out.println("The size of elements"+ l2.size());
    
    
}
}
