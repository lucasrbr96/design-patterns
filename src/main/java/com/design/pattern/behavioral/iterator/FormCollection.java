package com.design.pattern.behavioral.iterator;

import com.design.pattern.behavioral.iterator.model.Form;

import java.util.ArrayList;
import java.util.List;

public class FormCollection implements FormIterator{
    private int index = 0;

    private List<Form> forms = new ArrayList<>();

    public void addForm(final Form form) {
        forms.add(form);
    }

    @Override
    public boolean hasNext() {
        return index < forms.size();
    }

    @Override
    public Form next() {
        return hasNext() ? forms.get(index++) : null;
    }
}
