package com.list;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
    @Test
    void listAddElementTest() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(1);
        List<Integer> collect = arrayList.stream().filter(e -> e == null).collect(Collectors.toList());
        System.out.println(collect.size());
    }

    @Test
    void testStreamFilter() {
        ArrayList<String> strings = Lists.newArrayList("1");

        List<String> collect = strings.stream().filter(e -> "1".equals(e)).collect(Collectors.toList());

        System.out.println(collect);
    }
}
