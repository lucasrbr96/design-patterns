package com.design.pattern.creational.factoryMethod.concrete;

import com.design.pattern.creational.factoryMethod.Cake;

public class ChocolateCake extends Cake {
    @Override
    public void prepare() {
        System.out.println("Preparing the chocolate cake batter...");
    }

    @Override
    public void bake() {
        System.out.println("Baking the chocolate cake...");
    }

    @Override
    public void decorate() {
        System.out.println("Decorating the chocolate cake with ganache...");
    }
}
