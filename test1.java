package com.arafat.junit1;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class test1 {
    @Test
    public void assertTest(){
        String STR="Start with assetTest";
        assertEquals("Start with assetTest",STR);
    }
}
