package com.design.pattern.behavioral.iterator;


import com.design.pattern.behavioral.iterator.model.Form;

public class Main {
    public static void main(String[] args) {
        FormCollection collection = new FormCollection();
        collection.addForm(new Form("Form A"));
        collection.addForm(new Form("Form B"));
        collection.addForm(new Form("Form C"));

        while (collection.hasNext()) {
            Form form = collection.next();
            System.out.println("Title: " + form.getTitle());
        }
    }
}