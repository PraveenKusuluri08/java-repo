package Abstract;

abstract class Shape{
	String objName="";
	Shape(String name){
		this.objName=name;
	}
	public void display1() {
		System.out.println("Name is " +objName );
		
	}
	abstract public void area();
}
class rectangle extends Shape {
	int length,width;
	
	 
	rectangle(int length,int width,String name){
		super(name);
		this.length =length;
		this.width = width;
	}
	public void area() {
		double result;
		 result=(length*width);
		System.out.println("Area of the rectangel is " + result);
	}
	@Override
	public void display1() {
		System.out.println("length of the rectangle is " +this.length );
		System.out.println("length of the rectangle is " +this.width );
	}
}

public class AbstarctClass {

	public static void main(String[] args) {
		Shape obj =new rectangle(19, 50, "Rectangle");
		obj.display1();
		obj.area();
	}

}
