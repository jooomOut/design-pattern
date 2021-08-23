package com.company.structure.composite;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

public abstract class Equipment<name> {
    private String name;
    public String getName(){return this.name;};
    //public Watt getPower();
    public abstract int getNetPrice();
    public abstract Currency getDiscountPrice();

    public abstract void add(Equipment equipment);
    public abstract void remove(Equipment equipment);
    public abstract List<Equipment> createIterator();

}
