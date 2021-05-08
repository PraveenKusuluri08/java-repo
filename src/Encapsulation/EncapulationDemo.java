package Encapsulation;
//Encapsulation ->Binding data with methods
class student{
	private int number;
 	private String name;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	Getters and Setters
}
public class EncapulationDemo {

	public static void main(String[] args) {
		student s_1= new student();
		s_1.setNumber(588);
		s_1.setName("praveen");
		System.out.println(s_1.getNumber());
		System.out.println(s_1.getName());

	}

}
