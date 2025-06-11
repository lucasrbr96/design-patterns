package com.design.pattern.behavioral.chainResponsibility.formStatusConcrete;

import com.design.pattern.behavioral.chainResponsibility.FormStatusHandler;
import com.design.pattern.behavioral.chainResponsibility.model.Form;

public class ReviewHandler extends FormStatusHandler {

    @Override
    protected boolean canHandle(Form form) {
        return form.getStatus() == Form.Status.IN_REVIEW;
    }

    @Override
    protected boolean validate(Form form) {
        return form.getContent() != null && !form.getContent().isBlank();
    }

    @Override
    protected void approve(Form form) {
        System.out.println("Revisão aprovada. Indo para APROVAÇÃO.");
        form.setStatus(Form.Status.APPROVED);
    }

    @Override
    protected void reject(Form form) {
        System.out.println("Revisão rejeitada: conteúdo vazio. Voltando ao RASCUNHO.");
        form.setStatus(Form.Status.DRAFT);
    }
}
