package com.design.pattern.behavioral.chainResponsibility.model;

public class Form {
    private String title;
    private String content;
    private Status status;
    private Status previousStatus;

    public enum Status {
        DRAFT, IN_REVIEW, APPROVED, ARCHIVED
    }

    public Form(String title, String content) {
        this.title = title;
        this.content = content;
        this.status = Status.DRAFT;
        this.previousStatus = null;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status newStatus) {
        this.previousStatus = this.status;
        this.status = newStatus;
    }

    public void revertStatus() {
        if (previousStatus != null) {
            System.out.println("Revertendo para status anterior: " + previousStatus);
            this.status = previousStatus;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
