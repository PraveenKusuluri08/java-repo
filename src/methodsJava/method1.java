package methodsJava;

class Clac {
	int eId;
	int salary;
	static String company;
//if we make the variable static then it is same for all the objects
	public void show() {
		System.out.println("Employee ID : " + " " + eId);
		System.out.println("Employee Salary : " + " " + salary);
		System.out.println("Employee company : " + " " + company);
	}
}

public class method1 {
	public static void main(String[] args) {
		Clac praveen = new Clac();
		praveen.eId = 8;
		praveen.salary = 1000;
		praveen.company = "google";

		Clac kusuluri = new Clac();
		kusuluri.eId = 12;
		kusuluri.salary = 1000;
		Clac.company = "Microsoft";

		praveen.show();
		System.out.println("------------------------------");
		kusuluri.show();

	}
}
