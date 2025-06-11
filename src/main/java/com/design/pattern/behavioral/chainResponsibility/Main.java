package com.design.pattern.behavioral.chainResponsibility;


import com.design.pattern.behavioral.chainResponsibility.formStatusConcrete.ApprovalHandler;
import com.design.pattern.behavioral.chainResponsibility.formStatusConcrete.ArchiveHandler;
import com.design.pattern.behavioral.chainResponsibility.formStatusConcrete.DraftHandler;
import com.design.pattern.behavioral.chainResponsibility.formStatusConcrete.ReviewHandler;
import com.design.pattern.behavioral.chainResponsibility.model.Form;

public class Main {
    public static void main(String[] args) {
        Form form1 = new Form("", "Conteúdo");

        Form form2 = new Form("Relatório Final", "Conteúdo completo");

        FormStatusHandler draft = new DraftHandler();
        FormStatusHandler review = new ReviewHandler();
        FormStatusHandler approval = new ApprovalHandler();
        FormStatusHandler archive = new ArchiveHandler();

        draft.setNext(review);
        review.setNext(approval);
        approval.setNext(archive);

        System.out.println("=== Teste com título vazio ===");
        draft.handle(form1);
        System.out.println("Status final: " + form1.getStatus());

        System.out.println("\n=== Teste com dados válidos ===");
        draft.handle(form2);
        System.out.println("Status final: " + form2.getStatus());
    }
}