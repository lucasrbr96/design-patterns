package com.design.pattern.behavioral.command.model;

public class Thermostat {
    private int temperature;

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Thermostat set to " + temp + "°C.");
    }

    public void resetTemperature() {
        this.temperature = 20;
        System.out.println("Thermostat reset to default (20°C).");
    }
}
