package com.design.pattern.behavioral.chainResponsibility.formStatusConcrete;

import com.design.pattern.behavioral.chainResponsibility.FormStatusHandler;
import com.design.pattern.behavioral.chainResponsibility.model.Form;

public class ApprovalHandler extends FormStatusHandler {

    @Override
    protected boolean canHandle(Form form) {
        return form.getStatus() == Form.Status.APPROVED;
    }

    @Override
    protected boolean validate(Form form) {
        return form.getTitle().length() >= 5;
    }

    @Override
    protected void approve(Form form) {
        System.out.println("Aprovação finalizada. Indo para ARQUIVADO.");
        form.setStatus(Form.Status.ARCHIVED);
    }

    @Override
    protected void reject(Form form) {
        System.out.println("Aprovação rejeitada: título muito curto. Voltando à REVISÃO.");
        form.setStatus(Form.Status.IN_REVIEW);
    }
}
