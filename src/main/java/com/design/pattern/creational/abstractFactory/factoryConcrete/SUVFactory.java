package com.design.pattern.creational.abstractFactory.factoryConcrete;

import com.design.pattern.creational.abstractFactory.Car;
import com.design.pattern.creational.abstractFactory.CarFactory;
import com.design.pattern.creational.abstractFactory.abstractFactoryConcrete.SUV;

public class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SUV("Hyundai Creta");
    }
}
