package com.design.pattern.behavioral.command.commandConcrete;

import com.design.pattern.behavioral.command.Command;
import com.design.pattern.behavioral.command.model.Light;

public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
