package ExceptionHandling;

public class Exception1 {

	public static void main(String[] args){
		try {
			int a[]=new int[10];
			a[0]=11;
			System.out.println(a[10]);
			
		}catch(ArithmeticException |ArrayIndexOutOfBoundsException e) {
			
			System.err.println(e.getLocalizedMessage());
			System.err.println("Please check the array");
		}finally {
			System.out.println("this is the try, catch an finally block");
		}
	}
}
