package edu.lazyprogrammer.def.method;

public interface InterfaceA {

    default void printSomething() {
        System.out.println("I am inside A interface");
    }
}
