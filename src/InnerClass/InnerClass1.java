package InnerClass;


class Outer{
	public void method1() {
		System.out.println("Innthe outer class Method");
	}
	class Inner{
		public void method2() {
			System.out.println("In the inner class mehod");
		}
	}
}

public class InnerClass1 {

	public static void main(String[] args) {
		Outer obj1 = new Outer();
		obj1.method1();
		Outer.Inner obj2 = obj1.new Inner();
		obj2.method2();
	}

}
