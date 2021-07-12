package Abstract;

//interface dog{
//	 default public void bark() {
//		 System.out.println("Dog is barking in interface");
//	 }
//}

//class dog1 implements dog{
//	
//}
abstract class Dog{
	
	 abstract  void bark(); 
	public abstract void breed();
	
}


class Dog1 extends Dog {
   public  void bark() {
		System.out.println("Dog Barks");
	}
   public void breed() {
	   System.out.println("Bread of the dog is retriever");
   }
}
public class ABSTRACTDOMO {

	public static void main(String[] args) {
//		Dog1 obj = new Dog1();
//
//		obj.bark();
//		
//		obj.breed();
//		
		
		Dog1 obj1 = new Dog1();
		obj1.bark();
	}

}
