package com.company.structure.composite.template;

import java.util.List;

public abstract class Component {
    protected int value;
    protected Component parent;

    public int getValue() {
        return value;
    }

    public void add(Component child){
        throw new UnsupportedOperationException();
    }
    public void remove(Component child){
        throw new UnsupportedOperationException();
    }
    public List<Component> getChildren(){
        throw new UnsupportedOperationException();
    }
}
