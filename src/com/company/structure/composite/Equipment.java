package com.company.structure.composite;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;

public interface Equipment<name> {
    public String getName();
    //public Watt getPower();
    public Currency getNetPrice();
    public Currency getDiscountPrice();

    public void add(Equipment equipment);
    public void remove(Equipment equipment);
    public Iterator<Equipment> createIterator();

}
