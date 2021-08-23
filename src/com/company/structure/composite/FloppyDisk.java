package com.company.structure.composite;

import java.util.Currency;
import java.util.Iterator;
import java.util.List;

public class FloppyDisk implements Equipment {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getNetPrice() {
        return null;
    }

    @Override
    public Currency getDiscountPrice() {
        return null;
    }

    @Override
    public void add(Equipment equipment) {

    }

    @Override
    public void remove(Equipment equipment) {

    }

    @Override
    public List<Equipment> createIterator() {
        return null;
    }
}
