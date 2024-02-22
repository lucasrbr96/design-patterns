package com.design.pattern.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = (Car) car1.clone();

        System.out.println(car1.equals(car2));
    }
}