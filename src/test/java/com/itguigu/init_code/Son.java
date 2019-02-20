package com.itguigu.init_code;

public class Son extends Father {

    static {
        System.out.println("(6)");
    }

    private int i = test();

    private static int j = method();

    Son() {
        super();//写不写都存在
        System.out.println("(7)");
    }

    {
        System.out.println("(8)");
    }

    public int test() {
        System.out.println("(9)");
        return 1;
    }

    public static int method() {
        System.out.println("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son son = new Son();

        Son son1 = new Son();
    }
}
