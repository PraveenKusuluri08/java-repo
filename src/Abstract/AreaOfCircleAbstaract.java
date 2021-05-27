package Abstract;

abstract class point{
	String objectName ="";
	point(String name){
		this.objectName = name;
	}
	public abstract double area(); 
}
class circle extends point{
	float pi = (float)Math.PI;int radius;
		circle(int radius,String name){
		super (name);
		this.radius=radius;
	}
		public double area() {
			return (double)((pi *radius  *radius));
		}
	
}

public class AreaOfCircleAbstaract {

	public static void main(String[] args) {
		
		point obj = new circle(121,"circle"); 
		System.out.println("Area of the circle is " + obj.area());
	} 

}
