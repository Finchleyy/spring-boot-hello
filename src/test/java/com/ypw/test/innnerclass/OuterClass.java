package com.ypw.test.innnerclass;

public class OuterClass {

    public String outerClassString = "outerClass";

    public class MyInnerClass {
        public void innerclassMethod() {
            System.out.println("i am inner class");
        }
    }

    public void outClassMethod() {
        MyInnerClass myInnerClass = new MyInnerClass();
        myInnerClass.innerclassMethod();
        System.out.println("i am outer class");
    }
}
