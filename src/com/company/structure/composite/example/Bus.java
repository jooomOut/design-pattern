package com.company.structure.composite.example;

public class Bus extends CompositeEquipment{
    Bus(String name){
        this.name = name;
    }

    private int netPrice;

    @Override
    public int getNetPrice(){
        return this.netPrice;
    }
}
