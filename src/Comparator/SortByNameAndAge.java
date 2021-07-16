package Comparator;

import java.util.Comparator;

class Employee{
	String name;
	int age;
	int salary;
	public Employee(String name,int age,int salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}

class comparatorClass implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int nameCompare = o1.getName().compareTo(o2.getName());
		 int ageCompare = o1.getAge().compareTo(
	                o2.getAge());
		
		
	}
	
}

public class SortByNameAndAge {

	public static void main(String[] args) {
		

	}

}
