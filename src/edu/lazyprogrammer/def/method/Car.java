package edu.lazyprogrammer.def.method;

public class Car implements Vehicle {
    @Override
    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle in Car Class");
    }


	public static void main(String args[]){
        Car car = new Car();
        car.cleanVehicle();
        car.startVehicle();
    }
}
