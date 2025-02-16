package prog1;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ThreadLinkedHashMap {
	static void sleepLinkedHashMap(LinkedHashMap<Integer,String>ut){
	{
		 ut.put(60, "gugu");
		 ut.put(40, "tugu");
		 ut.put(30, "bugu");
		 System.out.println("the added statements are :"+ut);
			ut.remove(1);
			System.out.println("mapping after removal:"+ut);
			System.out.println("mapping  traversal");
			for(Entry<Integer, String> e:ut.entrySet()) {
				System.out.println("Key: " + e.getKey()
                + " Value: " + e.getValue());
    System.out.println("---------------------------------------------------------------------------------");
}
			}
}
}
