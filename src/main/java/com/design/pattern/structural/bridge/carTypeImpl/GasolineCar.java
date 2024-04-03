package com.design.pattern.structural.bridge.carTypeImpl;

import com.design.pattern.structural.bridge.CarType;

public class GasolineCar implements CarType {
    @Override
    public void accelerate() {
        System.out.println("Gasoline car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Gasoline car is braking...");
    }
}
