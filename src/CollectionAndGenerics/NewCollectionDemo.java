package CollectionAndGenerics;
import java.util.*;
public class NewCollectionDemo {

	public static void main(String[] args) {
		
		//list1 one can only store String objects
		ArrayList<String> list1 = new ArrayList<String>();
		
		//list2 can store can store any form of data
		ArrayList list2 = new ArrayList();
		
		//add data to the list
		list1.add("praveen");
		list1.add("praveen");
		list1.add("praveen");
		list1.add("praveen");
		list1.add("praveen");
		list1.add("praveen");
		list1.add("praveen");
		list1.add("1");
		
		list2.add(11);
		list2.add("Praveen");
		
		System.out.println("list1" + list1);
		System.out.println("list2" + list2);
	}

}
