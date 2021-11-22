package com.company.creation.singleton.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreaker {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        BillPughSingleton instance = BillPughSingleton.getInstance();
        System.out.println("Singleton Instance is : " + instance.toString());

        for (Constructor constructor : BillPughSingleton.class.getDeclaredConstructors()) {
            constructor.setAccessible(true); // singleton breaker
            BillPughSingleton newInstance = (BillPughSingleton) constructor.newInstance();
            System.out.println("New Instance is : " + newInstance.toString());
            break;
        }

        EnumSingleton.INSTANCE.printInstance();
    }
}
