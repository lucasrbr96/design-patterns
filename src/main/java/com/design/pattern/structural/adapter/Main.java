package com.design.pattern.structural.adapter;


import com.design.pattern.structural.adapter.adapters.MotorcycleAdapter;
import com.design.pattern.structural.adapter.impl.CarImpl;
import com.design.pattern.structural.adapter.impl.MotorcycleImpl;

public class Main {
    public static void main(String[] args) {
        // Using a car
        Car car = new CarImpl();
        System.out.println("Car:");
        car.accelerate();
        car.brake();

        System.out.println("----------------------------------");

        // Using a motorcycle through the adapter
        Motorcycle motorcycle = new MotorcycleImpl();
        Car motorcycleAdapter = new MotorcycleAdapter(motorcycle);
        System.out.println("Motorcycle (adapted as car):");
        motorcycleAdapter.accelerate();
        motorcycleAdapter.brake();
    }
}