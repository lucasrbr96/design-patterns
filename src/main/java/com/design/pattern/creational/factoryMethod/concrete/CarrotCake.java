package com.design.pattern.creational.factoryMethod.concrete;

import com.design.pattern.creational.factoryMethod.Cake;

public class CarrotCake extends Cake {

    @Override
    public void prepare() {
        System.out.println("Preparing carrot cake batter...");
    }

    @Override
    public void bake() {
        System.out.println("Baking the carrot cake...");
    }

    @Override
    public void decorate() {
        System.out.println("Decorating carrot cake with cream cheese frosting...");
    }
}
