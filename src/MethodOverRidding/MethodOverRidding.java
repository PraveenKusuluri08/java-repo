package MethodOverRidding;

class A {
	public void display() {
		System.out.println("in a");
	}
}
class B extends A{
	public void display() {
		super.display();
		System.out.println("in b");
	}
}
public class MethodOverRidding {

	public static void main(String[] args) {
		B obj = new B();
		obj.display();

	}

}
