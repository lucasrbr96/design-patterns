package com.design.pattern.behavioral.chainResponsibility;

import com.design.pattern.behavioral.chainResponsibility.model.Form;

public abstract class FormStatusHandler {
    protected FormStatusHandler next;

    public void setNext(FormStatusHandler next) {
        this.next = next;
    }

    public void handle(Form form) {
        if (canHandle(form)) {
            if (validate(form)) {
                approve(form);
                if (next != null) {
                    next.handle(form);
                }
            } else {
                reject(form);
            }
        } else if (next != null) {
            next.handle(form);
        } else {
            System.out.println("Nenhum manipulador pôde processar o formulário.");
        }
    }

    protected abstract boolean canHandle(Form form);
    protected abstract boolean validate(Form form);
    protected abstract void approve(Form form);
    protected abstract void reject(Form form);
}
