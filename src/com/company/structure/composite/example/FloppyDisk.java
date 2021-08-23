package com.company.structure.composite.example;

import java.util.Currency;
import java.util.List;

public class FloppyDisk extends Equipment {
    private int netPrice;

    FloppyDisk(String name){
        this.name = name;
    }

    @Override
    public int getNetPrice() {
        return this.netPrice;
    }

}
