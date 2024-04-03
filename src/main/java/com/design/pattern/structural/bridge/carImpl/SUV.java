package com.design.pattern.structural.bridge.carImpl;

import com.design.pattern.structural.bridge.Car;
import com.design.pattern.structural.bridge.CarType;

public class SUV extends Car {
    public SUV(CarType implementation) {
        super(implementation);
    }

    @Override
    public void drive() {
        System.out.println("Driving an SUV:");
        implementation.accelerate();
        implementation.brake();
    }
}
