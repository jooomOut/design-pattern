package com.company.structure.composite.example;

public class Chassis extends CompositeEquipment{
    private int netPrice;
    @Override
    public int getNetPrice(){
        return this.netPrice;
    }
}
