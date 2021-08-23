package com.company.structure.composite;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

public interface Equipment<name> {
    public String getName();
    //public Watt getPower();
    public int getNetPrice();
    public Currency getDiscountPrice();

    public void add(Equipment equipment);
    public void remove(Equipment equipment);
    public List<Equipment> createIterator();

}
