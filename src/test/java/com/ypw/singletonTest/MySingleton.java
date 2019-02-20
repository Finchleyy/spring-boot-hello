package com.ypw.singletonTest;

public class MySingleton {
    private static MySingleton instance = new MySingleton();

    private MySingleton() {

    }
    public static MySingleton getSingleTon() {
        return instance;
    }
}
