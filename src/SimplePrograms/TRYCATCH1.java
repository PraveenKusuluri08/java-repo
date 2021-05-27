package SimplePrograms;

import java.util.*;

public class TRYCATCH1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of the n");
		int n = scan.nextInt();
		scan.close();
		try {
			while (true) {
				if (n % 2 == 0) {
					System.out.println("Even number " + n);
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Exception    " + e);
		}

	}

}
