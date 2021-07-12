package CollectionAndGenerics;
import java.util.*;

 class Class implements Comparable<Class>{
	int roll,marks;
	String name;
	public Class(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Class [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
	public int compareTo(Class o) {
		
		return (roll>o.roll) ? 1 :-1;
	}
	
}

public class Collection1Demo {

	public static void main(String[] args) {
		List<Class> obj = new ArrayList<Class>();
		
		obj.add(new Class(12,100,"praveen"));
		obj.add(new Class(13,99,"praveen"));
		obj.add(new Class(15,97,"praveen"));
		obj.add(new Class(14,98,"praveen"));
		
		Collections.sort(obj);
		
		for(Class i:obj){
			System.out.println(i);
		}
	}

}
