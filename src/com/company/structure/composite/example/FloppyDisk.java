package com.company.structure.composite.example;

import java.util.Currency;
import java.util.List;

public class FloppyDisk extends Equipment {
    FloppyDisk(String name){
        this.name = name;
    }

    @Override
    public int getNetPrice() {
        return 0;
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
