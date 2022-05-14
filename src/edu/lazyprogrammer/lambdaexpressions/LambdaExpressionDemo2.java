package edu.lazyprogrammer.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionDemo2 {

	public static int j=90;
	public static void main(String[] args) {
		int i=50;
		CalculatorInterface cal=(a,b)->{
			System.out.println("Local Valiable: "+i);
			System.out.println("Static Valiable: "+j);
			return a+b;
		};
		//System.out.println(cal.add(89, 78));
		
		List<Student> students=populateStudentList();
		//System.out.println("Without Sorting: "+students);
		
		Collections.sort(students, (o1, o2) -> o1.getStudentName().compareTo(o2.studentName));
		
		/*
		 * (o1, o2) -> o2.getStudentName().compareTo(o1.studentName); 
		 */
		//System.out.println("After Sorting: "+students);
		
		students.forEach(s->System.out.println(s.getCountry()));
		students.stream().filter(s->s.getCountry().contains("U")).forEach(s->System.out.println(s));
		}
	private static List<Student> populateStudentList() {
		Student s1=new Student(1L, "John", "USA");
		Student s2=new Student(8L, "Mike", "Canada");
		Student s3=new Student(2L, "Andy", "UK");
		ArrayList<Student> students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		return students;
	}

}
