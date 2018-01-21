package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class PineappleDecorator extends AbstractPizzaDecorator {
    public PineappleDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
        super.getIngredients().add("Pineapple");
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Pineapple";
    }

    @Override
    public List<String> getIngredients() {
        return super.getIngredients();
    }
}
