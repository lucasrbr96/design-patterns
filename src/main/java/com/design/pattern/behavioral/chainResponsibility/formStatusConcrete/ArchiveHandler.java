package com.design.pattern.behavioral.chainResponsibility.formStatusConcrete;

import com.design.pattern.behavioral.chainResponsibility.FormStatusHandler;
import com.design.pattern.behavioral.chainResponsibility.model.Form;

public class ArchiveHandler extends FormStatusHandler {

    @Override
    protected boolean canHandle(Form form) {
        return form.getStatus() == Form.Status.ARCHIVED;
    }

    @Override
    protected boolean validate(Form form) {
        return true;
    }

    @Override
    protected void approve(Form form) {
        System.out.println("Formulário arquivado com sucesso.");
    }

    @Override
    protected void reject(Form form) {
        // Não se aplica para arquivamento
    }
}
