package Wrapper;

public class ParseIntMethod {

	public static void main(String[] args) {
		String s="12345";
		int a;
		a= Integer.parseInt(s); //parseInt method is static method in-order to use that we use class
		System.out.println(a);
		int i=1234;
		Integer ii = new Integer(i);
		int value = ii.hashCode();
		System.out.println(value);
		System.out.println(Integer.rotateLeft(10,3));	  
	}

}
