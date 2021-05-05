package OOPS;
 //IS-A- whenever we have a class and extends anther class
//HAS-A whenever we have a class and which we are creating object of another class
class Calculator1 {
	public int add(int a, int b) {
		return a + b;
	}
}

class Calculator2 extends Calculator1 {
	public int sub(int a, int b) {
		return a - b;
	}
}

class Calculator3 extends Calculator2 {
	public int mul(int a, int b) {
		return a - b;
	}
}

public class MultiLevelInherentence {

	public static void main(String[] args) {
		Calculator3 obj = new Calculator3();
		System.out.println("Addition is ");
		int result = obj.add(12, 44);
		System.out.println("Subtraction is ");
		int result1 = obj.sub(12, 9);
		System.out.println("Multiplication is ");
		int result2 = obj.mul(5, 10);

		System.out.println("Result is ");
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}

}
