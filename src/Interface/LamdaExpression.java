package Interface;

@FunctionalInterface
interface lambda{
	public void add();
}

public class LamdaExpression {

	public static void main(String[] args) {
		int a=10, b=20;
		lambda obj =()->{
			System.out.println(a+b);
		};
		obj.add();
	}

}
