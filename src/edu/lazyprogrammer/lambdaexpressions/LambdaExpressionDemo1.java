package edu.lazyprogrammer.lambdaexpressions;

public class LambdaExpressionDemo1{

	public static void main(String[] args) {
		//CalculatorInterface cal=new LambdaExpressionDemo1();
		//System.out.println(cal.add(10, 20));
		
		CalculatorInterface cal=(int a, int b)-> {
			return a+b;
		};
		
		System.out.println(cal.add(20, 30));
		
		Greeter greet=obj->System.out.println("Hello "+obj);
		greet.sayHi("Aman");
		
		Greeter2 greet2=()->{
			System.out.println("Hello There!!");
			System.out.println("How are you?");
		};
		
		greet2.sayHello();
	}

	

}
