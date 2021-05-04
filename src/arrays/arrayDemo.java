package arrays;
import java.util.Arrays;
public class arrayDemo {

	public static void main(String[] args) {
		int a[] = {1,6,2,74,0,-1};
	
		Arrays.sort(a);
		int key=1;
		System.out.println(key + "Found at the location " + Arrays.binarySearch(a, key));
		
	}

}
