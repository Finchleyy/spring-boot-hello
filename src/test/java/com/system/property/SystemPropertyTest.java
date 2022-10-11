package com.system.property;

import org.junit.jupiter.api.Test;

public class SystemPropertyTest {
    @Test
    void name() {
        System.out.println(System.getProperty("java.io.tmpdir"));
        System.out.println(System.getProperty("java.class.path"));

        int i = 100_00;

        System.out.println(i);
    }
}
