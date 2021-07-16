package Comparator;

import java.util.*;
import java.io.*;

class Student {
	int rollNo;
	String name;
	String address;

	public Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return this.rollNo + " " + this.name + " " + this.address;

	}

}

class SortByRollNo implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.rollNo - b.rollNo;
	}
}

class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {

		return a.name.compareTo(b.name);
	}
}

public class NewComparator {

	public static void main(String[] args) {
		List<Student> s1 = new ArrayList<>();
		s1.add(new Student(588, "Praveen", "WESTGODAVARI"));
		s1.add(new Student(583, "Murali", "WESTGODAVARI"));
		s1.add(new Student(584, "Python", "WESTGODAVARI"));
		s1.add(new Student(591, "Surya", "WESTGODAVARI"));

		System.out.println("Data of the students");

		for (int i = 0; i < s1.size(); i++) {
			System.out.println(s1.get(i));
		}
		Collections.sort(s1, new SortByRollNo());
		System.out.println("Data sort by roll Number");
		for (int i = 0; i < s1.size(); i++) {
			System.out.println(s1.get(i));
		}
	}

}
