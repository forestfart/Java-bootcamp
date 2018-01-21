package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BasicPizzaOrder implements PizzaOrder {
    private List<String> ingredients = new ArrayList<>();
    private PizzaStandardIngredients pizzaStandardIngredients = new PizzaStandardIngredients();

    public BasicPizzaOrder() {
        this.ingredients.add(pizzaStandardIngredients.getStandardIngredients().get(0));
        this.ingredients.add(pizzaStandardIngredients.getStandardIngredients().get(1));
        this.ingredients.add(pizzaStandardIngredients.getStandardIngredients().get(2));
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Standard Pizza order";
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}
