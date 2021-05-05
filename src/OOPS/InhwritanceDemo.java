package OOPS;

class Cal{   //super, parent,base class   //(in concept of java we use super) (and in concept of oops parent) (in concept of c++ we use base)
	public int add(int a ,int b) { 
		return a+b;
	}
}
class Cal1 extends Cal{  //Sub,child,derived class  (in concept of java we use Sub) (and in concept of oops child) (in concept of c++ we use Derived )

	public int sub(int a ,int b) {
		return a-b;
	}
}

public class InhwritanceDemo {

	public static void main(String[] args) {
		Cal1 obj = new Cal1();
		
		int result = obj.add(12,22);
		int result1 = obj.sub(12,22);
		
		System.out.println(result);	
		System.out.println(result1);
	}

}
