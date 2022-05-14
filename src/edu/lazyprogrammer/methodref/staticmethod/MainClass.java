package edu.lazyprogrammer.methodref.staticmethod;


public class MainClass {

	public static void main(String[] args) {
		CalculateInterface cal = MyCal::add;
		System.out.println(cal.sumMethod(10, 40));
	}

}