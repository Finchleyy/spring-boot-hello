package com.ypw.springboothello.GOF23.prototype;

import java.util.Date;

public class SheepDeep implements Cloneable{
    private String sname;
    private Date birthday;
    private SheepParam sheepParam;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅复制时：
        // Object object = super.clone();
        // return object;

        // 改为深复制：
        SheepDeep sheepDeep = (SheepDeep) super.clone();
        // 本来是浅复制，现在将sheepParam对象复制一份并重新set进来
        sheepDeep.setSheepParam((SheepParam) sheepDeep.getSheepParam().clone());
        return sheepDeep;

    }

    public SheepDeep(String sname, Date birthday, SheepParam sheepParam) {
        this.sname = sname;
        this.birthday = birthday;
        this.sheepParam = sheepParam;
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

    public SheepParam getSheepParam() {
        return sheepParam;
    }

    public void setSheepParam(SheepParam sheepParam) {
        this.sheepParam = sheepParam;
    }
}
