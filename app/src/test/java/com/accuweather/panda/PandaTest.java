package com.accuweather.panda;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by osana.babayan on 4/6/15.
 */

@Config(emulateSdk = 18, reportSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class PandaTest {

    @Test
    public void PandaNameTest() {
        Panda p = new Panda();

        p.setName("Foo");

        Assert.assertEquals("Foo", p.getName());
    }

    @Test
    public void PandaEmptyTest() {
        Panda p = new Panda();

        Assert.assertNull(p.getName());
        // Assert.assertNotNull(p.getName());
    }



}
