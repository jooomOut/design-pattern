package com.company.creation.singleton.example;

/**
 * Double checked lock의 단점을 해결
 * 1. 속도가 빠른 편
 * 2. lazy loading 가능 -> 호출 시 static 클래스가 생성됨
 * 3. 동시성 제어
 * */
public class BillPughSingleton {

    private BillPughSingleton () {};

    private static final class InstanceHolder {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return InstanceHolder.instance;
    }
}
