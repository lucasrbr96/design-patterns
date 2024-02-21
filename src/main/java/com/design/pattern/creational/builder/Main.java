package com.design.pattern.creational.builder;

public class Main {
    public static void main(String[] args) {
       Product tShirt = new Product.Builder("T-shirt").description("New collection").price(20.0).build();
        System.out.println(tShirt.toString());
    }
}