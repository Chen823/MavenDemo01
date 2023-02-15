package com.chn;

import org.junit.Assert;
import org.junit.Test;

public class TesthelloMaven {
    @Test
    public void testAdd(){
        helloMaven hM = new helloMaven();
        int res = hM.add(10, 20);
        Assert.assertEquals(30,res);

    }
}
