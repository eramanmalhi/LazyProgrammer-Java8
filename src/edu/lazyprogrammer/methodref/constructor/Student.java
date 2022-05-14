package edu.lazyprogrammer.methodref.constructor;
//Student Class
public class Student {
	private int studentId;
	private String studentName;
	@Override
	public String toString() {
		return "Student Id: " + studentId + "\nStudent Name: " + studentName;
	}
	public Student(int studentId, String studentNam) {
		super();
		this.studentId = studentId;
		this.studentName = studentNam;
	}
	public Student() {
		super();
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentNam() {
		return studentName;
	}
	public void setStudentNam(String studentNam) {
		this.studentName = studentNam;
	}

}
