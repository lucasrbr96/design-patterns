package com.design.pattern.structural.composite.compositeImpl;

import com.design.pattern.structural.composite.FileSystemComponent;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private final String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "+ Directory: " + name);
        for (FileSystemComponent component : children) {
            component.show(indent + "  ");
        }
    }
}
