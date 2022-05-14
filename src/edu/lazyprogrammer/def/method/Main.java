package edu.lazyprogrammer.def.method;

public class Main implements InterfaceA, InterfaceB {
	  @Override
	    public void printSomething() {

	        //Provide our own implementation.
	        System.out.println("I am inside Main class");

	        //Use existing implementation from interfaceA or interfaceB or both.
	        InterfaceA.super.printSomething();
	        InterfaceB.super.printSomething();
	    }

	    public static void main(String args[]){
	         Main main = new Main();
	         main.printSomething();
	    }
}
