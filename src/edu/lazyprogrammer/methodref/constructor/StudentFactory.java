package edu.lazyprogrammer.methodref.constructor;

@FunctionalInterface
public interface StudentFactory {
	Student createStudent(int id, String name);
}
