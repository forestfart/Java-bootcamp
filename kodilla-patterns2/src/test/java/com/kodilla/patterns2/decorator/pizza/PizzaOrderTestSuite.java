package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaWithExtrasAndPineappleDecorator() {
        // Given
        PizzaStandardIngredients pizzaStandardIngredients = new PizzaStandardIngredients();
        List<String> standardIngredientsList = pizzaStandardIngredients.getStandardIngredients();

        PizzaOrder thisOrder = new BasicPizzaOrder();
        thisOrder = new ThreeExtrasForSevenDecorator(thisOrder,standardIngredientsList.get(3),standardIngredientsList.get(4), standardIngredientsList.get(5));
        thisOrder = new PineappleDecorator(thisOrder);

        // When
        BigDecimal orderPrice = thisOrder.getCost();
        String orderDescription = thisOrder.getDescription();
        System.out.println(orderDescription + " for total of $" + orderPrice);

        System.out.println("\n   Ingredients list:");
        thisOrder.getIngredients().stream().forEach(System.out::println);

        //Then
        assertEquals(new BigDecimal(27), orderPrice);
        assertEquals("Standard Pizza order + choice of 3 extras + Pineapple", orderDescription);
    }
}
