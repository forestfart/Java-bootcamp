package com.kodilla.patterns2.decorator.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaStandardIngredients {
    private final List<String> standardIngredients = new ArrayList<>();

    public PizzaStandardIngredients() {
        this.standardIngredients.add("dough/floor");
        this.standardIngredients.add("cheese");
        this.standardIngredients.add("tomato sauce");
        this.standardIngredients.add("salami");
        this.standardIngredients.add("olives");
        this.standardIngredients.add("oregano");
        this.standardIngredients.add("ketchup");
        this.standardIngredients.add("onion");
    }

    public List<String> getStandardIngredients() {
        return standardIngredients;
    }
}
