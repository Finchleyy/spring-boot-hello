package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString {
    public static void main(String[] args) {
        String s = "v1.0.001.201904291759";
        int i = s.hashCode();
        System.out.println(i);

        String[] version1Array = removeLetter(s).split("[._]");

        for (int j = 0; j < version1Array.length; j++) {
            System.out.println(version1Array[j]);
        }
    }

    /**
     * 剔除字母
     *
     * @param value
     */
    public static String removeLetter(String value) {
        Pattern p = Pattern.compile("[a-zA-z]");
        Matcher matcher = p.matcher(value);
        String result = matcher.replaceAll("");
        System.out.println(result);
        return result;
    }

}
