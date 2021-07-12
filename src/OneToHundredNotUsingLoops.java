import java.util.*;
public class OneToHundredNotUsingLoops {

	public static void main(String[] args) {
		Object obj[] =new Object[100]; 
		
		Arrays.fill(obj, new Object() {
			int count=0;
			
			public String toString() {
				return Integer.toString(++count);
			}
		});
		System.out.println(Arrays.toString(obj));
	}

}
