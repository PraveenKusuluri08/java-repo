package Interface;

@FunctionalInterface
interface object {
	void display();
}

class ref implements object {
	int a, b;

	ref(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void something() {
		if (a % b == 0) {
			double res = Math.pow(a, b);
			System.out.println(res);
		} else {
			System.out.println("Something is not possible");
		}
	}

	public void display() {
		System.out.println(this.a + " " + this.b);
	}
}

public class SampleInterface {

	public static void main(String[] args) {
		ref obj1 = new ref(12,11);
		obj1.something();
		obj1.display();
	}

}
