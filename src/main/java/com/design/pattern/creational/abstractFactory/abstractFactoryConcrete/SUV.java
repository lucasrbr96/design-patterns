package com.design.pattern.creational.abstractFactory.abstractFactoryConcrete;

import com.design.pattern.creational.abstractFactory.Car;

public class SUV implements Car {

    private String brand;

    public SUV(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void info() {
        System.out.println("Type: SUV");
        System.out.println("Brand: " + brand);
    }
}
