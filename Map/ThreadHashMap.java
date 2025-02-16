package prog1;

import java.util.HashMap;
import java.util.Map;

public class ThreadHashMap  {
public static void runHashMap(HashMap<Integer,String>rt) {
	rt.put(50,"hello");
	rt.put(56,"bye");
	rt.put(30,"goodmorn");
	rt.put(20,"goodnight");
	System.out.println("the added statements are :"+rt);
	rt.remove(1);
	System.out.println("mapping after removal:"+rt);
	System.out.println("mapping  traversal");
	for (Map.Entry<Integer, String> e : rt.entrySet())
        System.out.println("Key: " + e.getKey()
                + " Value: " + e.getValue());
    System.out.println("---------------------------------------------------------------------------------");
}


}


