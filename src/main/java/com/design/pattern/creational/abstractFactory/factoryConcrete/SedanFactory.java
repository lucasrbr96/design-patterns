package com.design.pattern.creational.abstractFactory.factoryConcrete;

import com.design.pattern.creational.abstractFactory.Car;
import com.design.pattern.creational.abstractFactory.CarFactory;
import com.design.pattern.creational.abstractFactory.abstractFactoryConcrete.Sedan;

public class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan("Toyota Corolla");
    }
}
