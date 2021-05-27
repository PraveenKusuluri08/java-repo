 package Abstract;
//if we create the class with object we cannot create the object of the class directly

abstract class Human { //abstract class
	public abstract void eat(); //declaration of the method
	
	public void sleep() {
		
	   
	}
	
}
class Man extends Human{ //Concrete class
	public void eat() {  //using the method
		System.out.println("int abstract class method");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		Man obj = new Man();
		obj.eat();
		
	}

}
