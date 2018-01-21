package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class ThreeExtrasForSevenDecorator extends AbstractPizzaDecorator {

    public ThreeExtrasForSevenDecorator(PizzaOrder pizzaOrder, String ingredientOne, String ingredientTwo, String ingredientThree) {
        super(pizzaOrder);
        super.getIngredients().add(ingredientOne);
        super.getIngredients().add(ingredientTwo);
        super.getIngredients().add(ingredientThree);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + choice of 3 extras";
    }

    @Override
    public List<String> getIngredients() {
        return super.getIngredients();
    }
}