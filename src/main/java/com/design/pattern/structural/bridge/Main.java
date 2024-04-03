package com.design.pattern.structural.bridge;

import com.design.pattern.structural.bridge.carImpl.SUV;
import com.design.pattern.structural.bridge.carImpl.Sedan;
import com.design.pattern.structural.bridge.carTypeImpl.ElectricCar;
import com.design.pattern.structural.bridge.carTypeImpl.GasolineCar;

public class Main {
    public static void main(String[] args) {

        // Criando uma instância de carro elétrico e associando-a com um sedan
        Car sedanElectricCar = new Sedan(new ElectricCar());
        sedanElectricCar.drive();

        System.out.println();

        // Criando uma instância de carro a gasolina e associando-a com um SUV
        Car suvGasolineCar = new SUV(new GasolineCar());
        suvGasolineCar.drive();
    }
}