package AnonymousClass;

class cal{
	public void add() {
		System.out.println("addition is " + (12+12));
	}
}

public class Anonymous {

	public static void main(String[] args) {
		cal obj = new cal() {
			public void add() {
				System.out.println("addition is " +(12-4));
			}
		};
		obj.add();

	}

}
