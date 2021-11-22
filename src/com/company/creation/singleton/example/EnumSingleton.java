package com.company.creation.singleton.example;

public enum EnumSingleton {
    INSTANCE;

    public void printInstance(){
        System.out.println(this.toString());
    }
    public void doSomething(){
        // ~~~~
    }
}
