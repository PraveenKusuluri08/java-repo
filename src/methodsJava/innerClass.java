package methodsJava;

class outer {
	int a;   //member variable
	
	public void show() {    //Member method
		
	}
	class inner{  //member class. inner class
		public void add(){
			System.out.println("Hello");
		}
	}
}

public class innerClass {

	public static void main(String[] args) {
		
		outer obj = new outer();
		obj.show();
		
		outer.inner obj1= obj.new inner();
//		if we want to use inner class we need to use outer class
//		if we want to create object for outer class we need to use outer class object
		obj1.add();
	}

}
