package SimplePrograms;
import java.util.*;
public class PrimeList {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number to print the prime numbers");
		int n=scan.nextInt();
		scan.close();
		int i,fact,j;
		for(i=1;i<=n;i++) {
			fact=0;
			for(j=1;j<=n;j++)
			{
				if(i%j==0) {
					fact++;
				}
			}
			if(fact==2) {
				System.out.println("Prime numbers are " + i);
			}
		}

	}

}
