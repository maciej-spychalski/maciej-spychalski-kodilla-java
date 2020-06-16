package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BUN_WITH_SESAME)
                .burgers(1)
                .sauce(Bigmac.BARBECUE)
                .ingredients(Bigmac.CUCUMBER)
                .ingredients(Bigmac.LETTUCE)
                .ingredients(Bigmac.ONION)
                .ingredients(Bigmac.BACON)
                .ingredients(Bigmac.CHEESE)
                .build();

        System.out.println(bigmac);

        //When
        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        int numberOfIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals("Bun with sesame", bun);
        Assert.assertEquals(1, burgers);
        Assert.assertEquals(5, numberOfIngredients);
    }
}
