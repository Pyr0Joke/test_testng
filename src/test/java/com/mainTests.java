package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class mainTests {

    @Test
    public void second_test(){
        Assert.assertEquals(5, 2+3);
    }
    @Test
    public void first_test(){
        Assert.assertEquals(5, 2+4);
    }
}
