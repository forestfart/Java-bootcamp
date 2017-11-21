package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testBigMacBuilder() throws Exception {

        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
            .roll("Plain")
            .sauce("Mayonnaise")
            .burgers(2)
            .ingredients("Lettuce")
            .ingredients("Onion")
            .ingredients("Pickle")
            .ingredients("Shrimp")
            .build();

        //When
        System.out.println(bigMac);

        //Then
        Assert.assertEquals(4, bigMac.getIngredients().size());
    }

    @Test(expected = InvalidBigMacException.class)
    public void testBigMacBuilderExceptionThrown() throws Exception {

        //Given When and Then
        BigMac bigMac = new BigMac.BigMacBuilder()
                .roll("Plain")
                .sauce("Mayonnaises") // <<-- exception thrown here
                .burgers(2)
                .ingredients("Lettuce")
                .ingredients("Onion")
                .ingredients("Pickle")
                .ingredients("Shrimp")
                .build();
    }
}