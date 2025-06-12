package com.design.pattern.behavioral.command;

import com.design.pattern.behavioral.command.commandConcrete.LockDoorCommand;
import com.design.pattern.behavioral.command.commandConcrete.SetTemperatureCommand;
import com.design.pattern.behavioral.command.commandConcrete.TurnOnLightCommand;
import com.design.pattern.behavioral.command.model.Door;
import com.design.pattern.behavioral.command.model.Light;
import com.design.pattern.behavioral.command.model.Thermostat;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Door door = new Door();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command lockDoor = new LockDoorCommand(door);
        Command setTemp = new SetTemperatureCommand(thermostat, 22);

        VoiceAssistant assistant = new VoiceAssistant();

        assistant.issueCommand(lightOn);
        assistant.issueCommand(lockDoor);
        assistant.issueCommand(setTemp);

        // Undo last command (setTemp)
        assistant.undoLastCommand(); // Thermostat reset

        // Undo another command (lockDoor)
        assistant.undoLastCommand();
    }
}