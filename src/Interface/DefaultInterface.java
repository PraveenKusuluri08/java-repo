package Interface;


interface sub{
	void abc();
	default public void display() {
		System.out.println("Hello world");
	}
}
class demo implements sub{
	public void abc() {
		System.out.println("In the abc method");
	}
	@Override
	 public void display() {
		 System.out.println("In display method");
	 }
}
public class DefaultInterface {

	public static void main(String[] args) {
		sub obj = new demo();
			obj.abc();	
			obj.display();
	}

}
 