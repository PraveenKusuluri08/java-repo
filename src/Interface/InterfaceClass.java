package Interface;

interface Abc{
	void show();
}
class implementor implements Abc{
	public void show() {
		System.out.println("In the implementor class");
	}
}


public class InterfaceClass {

	public static void main(String[] args) {
		
		Abc obj = new implementor();
		obj.show();
	}

}
