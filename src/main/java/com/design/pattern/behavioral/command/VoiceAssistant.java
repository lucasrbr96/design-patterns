package com.design.pattern.behavioral.command;

import java.util.Stack;

public class VoiceAssistant {
    private Stack<Command> history = new Stack<>();

    public void issueCommand(final Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            history.pop().undo();
        }
    }
}
