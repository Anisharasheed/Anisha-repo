package Listprog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class ThreadHashSet2 {
	
		
			public static void main(String[] args) {
				HashSet<Integer> l5 =  new HashSet<>();
				l5.add(7);
				l5.add(89);
				l5.add(45);
				l5.add(49);
				l5.add(05);
				l5.add(35);
				System.out.println(l5);
				System.out.println("the size of elements"+l5.size());
				System.out.println("before removing an element"+l5.size());
			l5.remove(89);
			System.out.println("after removing an element"+l5.size());
			System.out.println(l5);
	   for(Integer a:l5) {
		   if(a%7==0)
			   System.out.println(a);
	   }
			
			}}

