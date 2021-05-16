package Interface;

class alpha{
	public void show() {
		System.out.println("in the show");
	}
}
//in order to change the method we are over-riding the method writing the another class
class alpha1 extends alpha{
	public void show() {
		System.out.println("In the second show");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		alpha obj = new alpha1() {
			public void show() {
				System.out.println("In the second show-in the main method");
			}
		};
		obj.show(); 

	}

}
