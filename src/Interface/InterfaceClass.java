package Interface;

interface Abc{
	void show();
	
}
class implementor implements Abc{
	implementor(String name){
		 super();
	}
	public void show() {
		System.out.println("In the implementor class");
		
	}
}


public class InterfaceClass {

	public static void main(String[] args) {
		
		Abc obj = new implementor("Praveen");
		obj.show();
	}

}
