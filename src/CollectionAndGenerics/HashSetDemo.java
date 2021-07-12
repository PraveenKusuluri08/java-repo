package CollectionAndGenerics;
import java.util.*;
public class HashSetDemo {

	public static void main(String[]args) {
//		HashSet<String> set = new HashSet<>();
//		
//		set.add("praveen");
//		set.add("mike");
//		set.add("jack");
//		set.add("sparrow");
//		set.add("johnson");
//		set.add("tyson");
//		set.add("praveen");
//		set.add("jimmy");	
//		System.out.println("In the set values");
//		System.out.println(set);
//		
//		Iterator<String> itr =set.iterator();
//		
//		while(itr.hasNext()) {
//			String str = itr.next();
//			System.out.println(str);
//		}
//		set.remove("sparrow");
//		
//		System.out.println("set is " + set);
		
		//tree set
		
		TreeSet<String>tst = new TreeSet<String>();
		
		tst.add("praveen");
		tst.add("mike");
		tst.add("jack");
		tst.add("sparrow");
		tst.add("johnson");
		tst.add("tyson");
		tst.add("praveen");
		tst.add("jimmy");	
		
		System.out.println(tst);
		
		Iterator<String> itr =tst.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		tst.remove("sparrow");
		
		System.out.println("set is " + tst);
	}
}
