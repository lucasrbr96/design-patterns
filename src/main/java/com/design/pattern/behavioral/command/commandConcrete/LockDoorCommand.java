package com.design.pattern.behavioral.command.commandConcrete;

import com.design.pattern.behavioral.command.Command;
import com.design.pattern.behavioral.command.model.Door;

public class LockDoorCommand implements Command {
    private Door door;

    public LockDoorCommand(final Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.lock();
    }

    @Override
    public void undo() {
        door.unlock();
    }

}
