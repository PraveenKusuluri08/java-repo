package SimplePrograms;
import java.util.*;
public class ReadMultiple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S;
		int i=1;
		while(scan.hasNext()) {
			S = scan.nextLine();
			System.out.println(i + " " + S);
			i++;
		}
		scan.close();
		System.out.println("pravee");
	}

}
