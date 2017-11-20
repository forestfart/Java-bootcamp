package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testBigMacBuilder() {

        try {

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

        } catch (IllegalStateException e) {
            System.out.println(e + " <<<<------  please correct!");
        }
    }
}
