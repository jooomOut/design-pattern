package com.company.creation.singleton.example;

import java.io.Serial;
import java.io.Serializable;

/**
 * 직렬화된 인스턴스를 역직렬화할 때마다 새로운 인스턴스가 만들어진다는 문제가 있다.
 * readResolve를 사용해 가짜 인스턴스 리턴을 막아준다.
 * */
public class BillPughSingletonSerializaiton implements Serializable {

    private BillPughSingletonSerializaiton() {};

    private static final class InstanceHolder {
        private static final BillPughSingletonSerializaiton instance = new BillPughSingletonSerializaiton();
    }

    public static BillPughSingletonSerializaiton getInstance() {
        return InstanceHolder.instance;
    }


    /*
    * 진짜 인스턴스를 반환하고 가짜 인스턴스는 GC에게 맡긴다.
    * */
    @Serial
    private Object readResolve() {
        return getInstance();
    }
}
