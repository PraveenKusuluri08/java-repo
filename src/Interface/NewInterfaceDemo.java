package Interface;

interface waterBottle{
	String color ="Blue";
	void fill();
	void fillDown();
}

public class NewInterfaceDemo implements waterBottle {

	public static void main(String[] args) {
		NewInterfaceDemo obj = new NewInterfaceDemo();
		obj.fill();
		obj.fillDown();
	}
 public void fill() {
	 System.out.println(color+" color bottle is filled");
 }
 public void fillDown() {
	 System.out.println("The bottle which is filled is exhausted");
 }
}
