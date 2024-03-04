package com.design.pattern.structural.adapter.adapters;

import com.design.pattern.structural.adapter.Car;
import com.design.pattern.structural.adapter.Motorcycle;

public class MotorcycleAdapter implements Car {
    private final Motorcycle motorcycle;

    public MotorcycleAdapter(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    @Override
    public void accelerate() {
        motorcycle.speedUp();
    }

    @Override
    public void brake() {
        motorcycle.slowDown();
    }
}
