package edu.lazyprogrammer.def.method;

public interface InterfaceB {

    default void printSomething() {
        System.out.println("I am inside B interface");
    }
}
