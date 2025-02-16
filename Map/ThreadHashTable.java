package prog1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ThreadHashTable {
 static void sitHashtable(Hashtable<Integer,String>st){{
	 st.put(90, "i");
	 st.put(90, "love");
	 st.put(90, "you");
	 System.out.println("the added statements are :"+st);
		st.remove(1);
		System.out.println("mapping after removal:"+st);
		System.out.println("mapping  traversal");
		for (Map.Entry<Integer, String> e : st.entrySet())
	        System.out.println("Key: " + e.getKey()
	                + " Value: " + e.getValue());
	    System.out.println("---------------------------------------------------------------------------------");
	}
 }
}
