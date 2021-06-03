package CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<Number> obj = new ArrayList<>();
		obj.add(12.43);
		obj.add(11.3);
		
		obj.add(111.323);
		Iterator<Number> obj1 = obj.iterator();
		
		
		while(obj1.hasNext()) {
			System.out.println(obj1.next());
		}
	}

}
 