package com.design.pattern.structural.composite;

import com.design.pattern.structural.composite.compositeImpl.Directory;
import com.design.pattern.structural.composite.leafImpl.File;

public class Main {
    public static void main(String[] args) {

        Directory root = new Directory("root");
        Directory documents = new Directory("documents");
        Directory images = new Directory("images");
        Directory newFolder = new Directory("newFolder");

        File file1 = new File("resume.pdf");
        File file2 = new File("photo.jpg");
        File file3 = new File("notes.txt");
        File file4 = new File("notes2.txt");

        documents.addComponent(file1);
        documents.addComponent(file3);
        documents.addComponent(newFolder);
        newFolder.addComponent(file4);
        images.addComponent(file2);

        root.addComponent(documents);
        root.addComponent(images);

        root.show("");
    }
}