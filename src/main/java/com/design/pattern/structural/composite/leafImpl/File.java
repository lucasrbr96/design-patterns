package com.design.pattern.structural.composite.leafImpl;

import com.design.pattern.structural.composite.FileSystemComponent;

public class File implements FileSystemComponent {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "- File: " + name);
    }
}
