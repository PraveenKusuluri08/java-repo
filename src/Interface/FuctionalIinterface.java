package Interface;
//fubnctionalInterface which takes only one method declaration
import java.util.*;
@FunctionalInterface
interface a{
	void show();
	
}


public class FuctionalIinterface {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		a obj =  () ->
		    {
				int n;
				System.out.println("Enter the number ");
				n= scan.nextInt();
				String even="Even number";
				String odd ="Odd number";
				String result =(n%2==0)?even:odd;
				System.out.println(result);
			};
		obj.show();
	}

}
