package com.design.pattern.structural.bridge.carImpl;

import com.design.pattern.structural.bridge.Car;
import com.design.pattern.structural.bridge.CarType;

public class Sedan extends Car {
    public Sedan(CarType implementation) {
        super(implementation);
    }

    @Override
    public void drive() {
        System.out.println("Driving a sedan:");
        implementation.accelerate();
        implementation.brake();
    }
}
