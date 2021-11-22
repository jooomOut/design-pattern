package com.company.creation.singleton.example;

/**
 * Double checked lock
 * 1. thread-safe 하지만 속도가 느리다
 * 해결 -> Bill Pugh Singleton
 * */
public class Singleton {

    private static Singleton instance;

    private Singleton () {};

    public static Singleton get() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
