package com.design.pattern.creational.factoryMethod;



public class Main {
    public static void main(String[] args) {
        CakeFactory cakeFactory = new CakeFactoryImpl();

        Cake carrotCake = cakeFactory.createCake("carrot");
        System.out.println("Carrot cake:");
        carrotCake.prepare();
        carrotCake.bake();
        carrotCake.decorate();

        System.out.println("------------------------------");

        Cake chocolateCake = cakeFactory.createCake("chocolate");
        System.out.println("Chocolate cake:");
        chocolateCake.prepare();
        chocolateCake.bake();
        chocolateCake.decorate();
    }
}