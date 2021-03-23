package com.arafat.junit1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class test2 {
    @Test
    public void assertTest() {
        String str = "Yasin Arafat";
        assertEquals("yasin araft", str);
    }
}
