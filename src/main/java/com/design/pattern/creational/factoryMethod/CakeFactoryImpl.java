package com.design.pattern.creational.factoryMethod;

import com.design.pattern.creational.factoryMethod.concrete.CarrotCake;
import com.design.pattern.creational.factoryMethod.concrete.ChocolateCake;

public class CakeFactoryImpl implements CakeFactory{

    @Override
    public Cake createCake(String type) {
        if (type.equalsIgnoreCase("carrot")) {
            return new CarrotCake();
        } else if (type.equalsIgnoreCase("chocolate")) {
            return new ChocolateCake();
        } else {
            throw new IllegalArgumentException("Unsupported cake type.");
        }
    }
}
