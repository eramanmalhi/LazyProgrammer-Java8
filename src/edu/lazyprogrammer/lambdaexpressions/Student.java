package edu.lazyprogrammer.lambdaexpressions;

public class Student {

	public Long studentId;
	public String studentName;
	public String country;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", country=" + country + "]";
	}
	public Student(Long studentId, String studentName, String country) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.country = country;
	}
	public Student() {
		super();
	}
	
	
}
