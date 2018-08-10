package com.ypw.mapTest;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/9 14:03
 * @Version 1.0
 **/
public class MapTest {
    public static void main(String[] args) {
        YPWMap ypwMap = new YPWMap();
        ypwMap.put("111", "yyyyy");
        System.out.println(ypwMap.get("111"));
    }


}

