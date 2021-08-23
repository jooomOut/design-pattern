package com.company.structure.composite.example;

import java.util.Currency;
import java.util.List;

public abstract class Equipment<name> {
    protected String name;
    public String getName(){return this.name;};
    //public Watt getPower();
    public abstract int getNetPrice();
    //public abstract Currency getDiscountPrice();

    public void add(Equipment equipment){
        throw new UnsupportedOperationException();
    }
    public void remove(Equipment equipment){
        throw new UnsupportedOperationException();
    }
    public List<Equipment> createIterator(){
        throw new UnsupportedOperationException();
    }

}
