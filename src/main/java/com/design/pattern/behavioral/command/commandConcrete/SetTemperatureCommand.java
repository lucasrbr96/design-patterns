package com.design.pattern.behavioral.command.commandConcrete;

import com.design.pattern.behavioral.command.Command;
import com.design.pattern.behavioral.command.model.Thermostat;

public class SetTemperatureCommand implements Command {
    private Thermostat thermostat;
    private int temperature;

    public SetTemperatureCommand(final Thermostat thermostat, final int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(temperature);
    }

    @Override
    public void undo() {
        thermostat.resetTemperature();
    }
}
