package com.company.structure.composite.example;

public class Chassis extends CompositeEquipment{
    Chassis(String name){
        this.name = name;
    }

    private int netPrice;

    @Override
    public int getNetPrice(){
        return this.netPrice;
    }
}
