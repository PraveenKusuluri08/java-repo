package Properties;
import java.util.*;
import java.util.Map.Entry;
public class HashTable {

	
	public static void main(String[] args) {
		
		Map<String,Integer> mt = new HashMap<>();
		
		mt.put("a", 100);
		mt.put("b", 200);
		mt.put("c", 300);
		mt.put("d", 400);
		mt.put("e", 500);
		mt.put("f", 600);
		
		for(Map.Entry<String,Integer>me:mt.entrySet()) {
			System.out.println(me.getKey()+" : ");
			System.out.println(me.getValue());
		}
	}

}
