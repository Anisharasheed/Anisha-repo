package prog1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapmain {
public static void main(String[] args) {
HashMap<Integer, String> rt = new HashMap<>();
ThreadHashMap.runHashMap(rt);
Hashtable<Integer, String> st = new Hashtable<>();
LinkedHashMap<Integer, String> ut = new LinkedHashMap<>();
ThreadHashTable.sitHashtable(st);
ThreadLinkedHashMap.sleepLinkedHashMap(ut);
TreeMap<Integer, String> et = new TreeMap<>();
ThreadTreeMap.wakeTreeMap(et);

	



}
}



