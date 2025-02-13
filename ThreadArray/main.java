package Listprog;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		
THreadArrayList list1 = new THreadArrayList();
ThreadLinkedlist list2 = new ThreadLinkedlist();
ThreadVector list3 = new ThreadVector();
ThreadStack list4 =new ThreadStack();
list1.run();
list2.run();
list3.run();
list4.run();



}
}
