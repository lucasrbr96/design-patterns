package com.design.pattern.structural.bridge;

public abstract class Car {
    protected CarType implementation;

    public Car(CarType implementation) {
        this.implementation = implementation;
    }

    public abstract void drive();
}
