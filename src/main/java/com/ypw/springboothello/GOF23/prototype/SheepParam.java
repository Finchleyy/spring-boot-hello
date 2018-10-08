package com.ypw.springboothello.GOF23.prototype;

import java.io.Serializable;

public class SheepParam implements Cloneable, Serializable {
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public SheepParam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
