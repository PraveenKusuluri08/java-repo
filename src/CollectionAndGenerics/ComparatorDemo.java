package CollectionAndGenerics;

import java.util.*;

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Integer> lt = new ArrayList<>();

//		Comparator<Integer> comp = new Comparator<>() {
//			public int compare(Integer i,Integer j) {
//				if(i%10 > j%10) 
//					return 1;
//				else return -1;
//			}
//		};

		Comparator<Integer> comp = (i, j) -> {

			if (i % 10 > j % 10)
				return 1;
			else
				return -1;
		};

		lt.add(12);
		lt.add(29);
		lt.add(122);
		lt.add(1);
		lt.add(9);

		Collections.sort(lt, comp);

		for (Integer i : lt) {
			System.out.println(i);
		}

	}

}
