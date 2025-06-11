package com.design.pattern.behavioral.chainResponsibility.formStatusConcrete;

import com.design.pattern.behavioral.chainResponsibility.FormStatusHandler;
import com.design.pattern.behavioral.chainResponsibility.model.Form;

public class DraftHandler extends FormStatusHandler {

    @Override
    protected boolean canHandle(Form form) {
        return form.getStatus() == Form.Status.DRAFT;
    }

    @Override
    protected boolean validate(Form form) {
        return form.getTitle() != null && !form.getTitle().isBlank();
    }

    @Override
    protected void approve(Form form) {
        System.out.println("Rascunho validado. Indo para REVISÃO.");
        form.setStatus(Form.Status.IN_REVIEW);
    }

    @Override
    protected void reject(Form form) {
        System.out.println("Rascunho inválido. Corrija o título antes de continuar.");
    }
}
