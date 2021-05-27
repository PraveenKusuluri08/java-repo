package Interface;


interface lambda1{
	public String name(String name);
}
public class LambdaExpression1 {

	public static void main(String[] args) {
		lambda1 obj = (name)->{
			
			return "Hi there " + name;
		};
	System.out.println(obj.name("praveen"));
	}

}
