package InnerClass;

class OuterClass{
	static int a;
	public void method() {
		System.out.println("in the outer class ");
	}
	static class Inner{
		public void method1() {
			System.out.println("in the inner class");
		}
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
	
		OuterClass obj = new OuterClass();
		obj.method();
		OuterClass.Inner obj1 = new OuterClass.Inner();
		obj1.method1();
	}

}
