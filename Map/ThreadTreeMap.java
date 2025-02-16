package prog1;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ThreadTreeMap {
		 static void wakeTreeMap(TreeMap<Integer,String>et){{
			 et.put(65, "hfj");
			 et.put(47, "fjjf");
			 et.put(98, "jdhjf");
			 System.out.println("the added statements are :"+et);
				et.remove(1);
				System.out.println("mapping after removal:"+et);
				System.out.println("mapping  traversal");
				for(Entry<Integer, String> e:et.entrySet()) {
					System.out.println("Key: " + e.getKey()
	                + " Value: " + e.getValue());
	    System.out.println("---------------------------------------------------------------------------------");
	}
}
		 }
}
