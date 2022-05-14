package edu.lazyprogrammer.methodref.instmethod;

public class MainClass {

	public static void main(String[] args) {
		MyCal cal=new MyCal();
		CalculateInterface calIn=cal::add;
		System.out.println(calIn.sumMethod(23, 22));
	}
}
