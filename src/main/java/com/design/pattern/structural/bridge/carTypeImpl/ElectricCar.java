package com.design.pattern.structural.bridge.carTypeImpl;

import com.design.pattern.structural.bridge.CarType;

public class ElectricCar implements CarType {
    @Override
    public void accelerate() {
        System.out.println("Electric car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Electric car is braking...");
    }
}
