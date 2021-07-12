package CollectionAndGenerics;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> phone = new HashMap();

		phone.put("Praveen", "8919296298");
		phone.put("kusuuri", "7730819612");
		phone.put("ravi", " 9550849612");
		phone.put("kiran", "7569920917");
		phone.put("sriram", "9849529262");

//		Keys       values

//		Praveen-> 8919296298
//		kusuuri-> 7730819612
//		ravi   -> 9550849612
//		kiran ->7569920917
// 		sriram -> 9849529262

		Set<String> keys = phone.keySet();
		for (String i : keys) {
			System.out.println(i+" : " + phone.get(i));
		}

	}

}
