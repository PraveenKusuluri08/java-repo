package Super;

class A{
	public  A() {
		System.out.println("In a");
	}
	public  A(int i) {
		System.out.println("In a in parametrised");
	}
}
class B extends A{
	public B() {
		System.out.println("In b");
	}
	public B(int i) {
		
		super(i);
		System.out.println("In b in parametrised");
	}
	
}
public class SuperClassDemo {

	public static void main(String[] args) {
		B obj = new B(9);
		
	}

}
