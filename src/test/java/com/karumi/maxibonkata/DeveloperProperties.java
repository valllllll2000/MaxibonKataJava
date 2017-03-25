package com.karumi.maxibonkata;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

@RunWith(JUnitQuickcheck.class)
public class DeveloperProperties {

    @Property
    public void testNumberMaxibonsNeverNegative(int numberOfMaxibons) {
        System.out.println(numberOfMaxibons);
        Developer developer = new Developer("valeria", numberOfMaxibons);
        System.out.println("developer: " + developer.toString());
        assertTrue(developer.getNumberOfMaxibonsToGrab() >= 0);
    }

    @Test
    public void shouldGenerateCorrectDevelopers() throws Exception {
        assertEquals(3, Karumies.PEDRO.getNumberOfMaxibonsToGrab());
        assertEquals("Pedro", Karumies.PEDRO.getName());
    }
}
