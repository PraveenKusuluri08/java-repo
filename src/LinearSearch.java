import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []a=new int[10];
		int i;
		int count=0;
		System.out.println("Enter the value of the array");
		
		int n=scan.nextInt();
		
		System.out.println("Ente the array elements to the array : ");
		
		for(i=0;i<n;i++)
		{
			a[i] =scan.nextInt();
			
		}
		System.out.println("Enter the serach element to search element from the array");
		int key=scan.nextInt();
		scan.close();
		
		for(i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				System.out.println("Element is found in the array");
				
				break;
			}
			
		}
		if(i==n)
		{
			System.out.println("Element is not found");
		}
	}

}
