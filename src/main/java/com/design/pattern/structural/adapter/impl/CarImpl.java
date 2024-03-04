package com.design.pattern.structural.adapter.impl;

import com.design.pattern.structural.adapter.Car;

public class CarImpl implements Car {

    @Override
    public void accelerate() {
        System.out.println("Car accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Car braking...");
    }
}
