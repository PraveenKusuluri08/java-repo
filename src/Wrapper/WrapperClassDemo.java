package Wrapper;
public class WrapperClassDemo {

	public static void main(String[] args) {
		
		int i=3; //primitive value
	
		Integer ii=new Integer(i); //Boxing wraping
		
		int j = ii.intValue();//unBoxing
		System.out.println(j); 
		
		Integer value = i; //Auto Boxing 
		
		int k =value;  //Auto UnBoxing
	}

}
