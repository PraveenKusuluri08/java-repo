package BufferReader;
import java.util.*;
public class TryCatchBlock {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		try{
			if(n%2==0) {
				System.out.println("Even number");
			}
			else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.err.println("Odd number");
		}
	}

}
