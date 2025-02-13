package Listprog;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

	public class ThreadTreeset {
	    public static void main(String[] args) {
	        Set<Double> l4 = new TreeSet<>();
	        l4.add(5.7);
	        l4.add(89.5);
	        l4.add(45.3);
	        l4.add(95.4);
	        l4.add(5.3);
	        l4.add(4.23);

	        System.out.println("TreeSet elements: " + l4);
	        System.out.println("Size before removing an element: " + l4.size());

	        l4.remove(4.23);

	        System.out.println("Size after removing an element: " + l4.size());
	        System.out.println("Updated TreeSet elements: " + l4);

	        System.out.println("Elements greater than 20:");
	        for (Double a : l4) {
	            if (a > 20)
	                System.out.println(a);
	        }
	    }
	
			
			}

