package arrays;
import java.util.Arrays;
public class arrayDemo {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{1,2,3,4},{1,2,3}};
//		if the columns are not fixed then it is jagged array
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
	
		
	}

}
