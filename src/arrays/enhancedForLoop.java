package arrays;

public class enhancedForLoop {

	public static void main(String[] args) {

//		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		for (int i : a) {
//			System.out.println(i);
//		}
		int[][]a= {{1,2,3,},{1,2,3},{1,2,3}};
		
//		for each loop
		for(int i[] : a) {
			for(int j : i) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}
}