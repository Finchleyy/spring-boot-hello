package com.ypw.practise.single;

public class SingleStaticClass {
    private SingleStaticClass() {
    }

    private static class SingleInstance {
        private static final SingleStaticClass INSTANCE = new SingleStaticClass();
    }

    public static SingleStaticClass getSingleStaticInstance() {
        return SingleInstance.INSTANCE;
    }
}
