package Super;

class A{
	int i;
	
	public  A() {
		System.out.println("In a");
	}
	public  A(int i) {
		System.out.println(i);
		System.out.println("In a in parametrised");
	}
}
class B extends A{
	public B(int i) {
		super(i);
		System.out.println("In b " + i);
	}
	
	
}
public class SuperClassDemo {

	public static void main(String[] args) {
		B obj = new B(10);
		
	}

}
