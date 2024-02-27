package com.design.pattern.creational.abstractFactory;

import com.design.pattern.creational.abstractFactory.factoryConcrete.SUVFactory;
import com.design.pattern.creational.abstractFactory.factoryConcrete.SedanFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        Car sedanCar = sedanFactory.createCar();
        sedanCar.info();

        System.out.println("-----------------------");

        CarFactory suvFactory = new SUVFactory();
        Car suvCar = suvFactory.createCar();
        suvCar.info();
    }
}