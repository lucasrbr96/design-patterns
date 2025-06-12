package com.design.pattern.behavioral.iterator;

import com.design.pattern.behavioral.iterator.model.Form;

public interface FormIterator {
    boolean hasNext();
    Form next();
}
