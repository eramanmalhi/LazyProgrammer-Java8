package edu.lazyprogrammer.methodref.constructor;

public class MainClass {

	public static void main(String[] args) {
		StudentFactory studentFactory = Student::new;
		Student st1 = studentFactory.createStudent(1, "Aman");
		System.out.println(st1);
	}

}
