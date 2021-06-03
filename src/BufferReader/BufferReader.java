 package BufferReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferReader {

	public static void main(String[] args) {
		int n=0;
		System.out.println("Enter number");
		BufferedReader bb = null;
		try {
			
			bb =new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(bb.readLine());
			bb.close();
		}catch(Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
		System.out.println(n);
	}

}
