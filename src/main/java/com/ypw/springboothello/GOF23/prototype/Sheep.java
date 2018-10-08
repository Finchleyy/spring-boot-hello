package com.ypw.springboothello.GOF23.prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable, Serializable {
    private String sname;
    private Date birthday;
    private SheepParam sheepParam;

    public SheepParam getSheepParam() {
        return sheepParam;
    }

    public void setSheepParam(SheepParam sheepParam) {
        this.sheepParam = sheepParam;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Sheep(String sname, Date birthday, SheepParam sheepParam) {
        this.sname = sname;
        this.birthday = birthday;
        this.sheepParam = sheepParam;
    }

    public Sheep() {
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
