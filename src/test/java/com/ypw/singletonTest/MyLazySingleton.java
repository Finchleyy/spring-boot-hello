package com.ypw.singletonTest;

public class MyLazySingleton {
    private static volatile MyLazySingleton instance;

    private MyLazySingleton() {
    }

    public static MyLazySingleton getInstance() {
        if (instance == null) {
            synchronized (MyLazySingleton.class) {
                if (instance == null) {
                    instance = new MyLazySingleton();
                    return instance;
                }
            }
        }
        return instance;

    }
}
