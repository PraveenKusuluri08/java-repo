package SimplePrograms;
import java.util.*;
public class Fibanocciseries {

	public static void main(String[] args) {
		int previous=0;
		int next=1;
		int sum;
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value to print fibanocci series");
		int n = scan.nextInt();
		scan.close();
		for(i=0;i<n;i++)
		{
			sum=previous+next;
			System.out.println(previous);
			previous=next;
			next =sum;
		}
	}
}


		

