package com;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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


    @Test
    void name() {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
    }

    @Test
    void bigint() {
        BigInteger b0 = new BigInteger("0");
        BigInteger b1 = new BigInteger("11111111111111111111111111");
        while (b0.compareTo(b1) < 0) {
            b0 = b0.add(new BigInteger("1"));
            System.out.println(b0);
        }
    }

    @Test
    void local() {
        LocalDateTime parse = LocalDateTime.parse("2019-07-09 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(parse);

        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(1563882537, 0, ZoneOffset.ofHours(8));
        System.out.println(localDateTime);
    }

    @Test
    void str() {
        String s = "1";
        String[] split = s.split(",");
        System.out.println(split[0]);
    }

    @Test
    void split() {
        String source = "pid=123&tel=";
        String[] split = source.split("&");
        List<String> pid = Arrays.stream(split).filter(e -> e.contains("pid")).collect(Collectors.toList());
        System.out.println(pid.get(0));
    }
}
