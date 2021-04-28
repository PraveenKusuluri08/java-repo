
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,75,3,8,0,-1};
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<(a.length-i-1);j++) {
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
	}
	}

}
