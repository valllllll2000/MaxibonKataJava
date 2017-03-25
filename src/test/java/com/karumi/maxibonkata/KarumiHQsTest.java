package com.karumi.maxibonkata;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertTrue;

@RunWith(JUnitQuickcheck.class)
public class KarumiHQsTest {

    @Property
    public void testNumberMaxibonsAlwaysBiggerThan2(
            @From(DevelopersGenerator.class) Developer developer) {
        System.out.println("developer : " + developer.toString());
        KarumiHQs karumiHQs = new KarumiHQs();
        karumiHQs.openFridge(developer);
        int maxibonsLeft = karumiHQs.getMaxibonsLeft();
        System.out.println("maxibons left : " + maxibonsLeft);
        assertTrue(maxibonsLeft >= 2);
    }
}