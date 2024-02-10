package org.iffat;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        car.describeCar();
    }
}