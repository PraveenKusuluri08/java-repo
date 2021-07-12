package WRAPPERCLASS;

import java.util.*;

public class AutoBoxing {

	public static void main(String[] args) {
		
		//autoBoxing used to convert the primitive data types into objects 
		char e ='P';
		Character ch = e;
		
		//Unboxing=>reverse of autoBoxing where wrapper class object is converted to their corresponding primitive data types
		
		
		System.out.println(ch);
		
		ArrayList<Integer> array = new ArrayList<>();
		
		array.add(10);
		array.add(10); 
		array.add(150); 
		array.add(1550);
		
		Iterator<Integer> it = array.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
