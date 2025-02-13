package Listprog;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class ThreadSet extends Thread{
	
		public static void main(String[] args) {
			LinkedHashSet<Integer> l3 =  new LinkedHashSet<>();
			l3.add(5);
			l3.add(89);
			l3.add(45);
			l3.add(95);
			l3.add(05);
			l3.add(4);
			System.out.println(l3);
			System.out.println("the size of elements"+l3.size());
			System.out.println("before removing an element"+l3.size());
		l3.remove(4);
		System.out.println("after removing an element"+l3.size());
		System.out.println(l3);
   for(Integer a:l3) {
	   if(a>5)
		   System.out.println(a);
   }
		
		}}
