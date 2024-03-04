package com.design.pattern.structural.adapter.impl;

import com.design.pattern.structural.adapter.Motorcycle;

public class MotorcycleImpl implements Motorcycle {
    @Override
    public void speedUp() {
        System.out.println("Motorcycle speeding up...");
    }

    @Override
    public void slowDown() {
        System.out.println("Motorcycle slowing down...");
    }
}
