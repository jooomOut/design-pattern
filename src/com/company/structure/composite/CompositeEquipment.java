package com.company.structure.composite;

import java.util.Currency;
import java.util.Iterator;
import java.util.List;

public class CompositeEquipment implements Equipment {
    private List<Equipment> equipmentList;

    @Override
    public String getName() {
        return null;
    }
    // creatae iterator를 사용해 구성요소를 구하고 각 장비마다 netprice 호출해 총합 리턴
   @Override
    public int getNetPrice() {
        int ret = 0;
        for(Equipment equipment : this.equipmentList) {
            ret += equipment.getNetPrice();
        }
        return ret;
    }

    @Override
    public Currency getDiscountPrice() {
        return null;
    }
    // 장비 리스트에 장비를 추가.
    @Override
    public void add(Equipment equipment) {

    }

    @Override
    public void remove(Equipment equipment) {

    }
    // 장비 리스트 순
    @Override
    public List<Equipment> createIterator() {
        return this.equipmentList;
    }
}
