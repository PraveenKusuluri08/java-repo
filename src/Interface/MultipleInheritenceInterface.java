package Interface;

@FunctionalInterface
interface demo{
	public void demo1();
	default public void display() {
		System.out.println("In the display interface");
	}
}
interface demo2{
	default public void show() {
		System.out.println("In the show method");
	}
}
abstract class demoSetup implements demo,demo2{
	public void abc(){
		System.out.println("In the show method");
	}
}
public class MultipleInheritenceInterface {

	public static void main(String[] args) {
	

	}

}
