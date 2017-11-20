package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;

public class BigMac {
    private static String SESAME = "Sesame";
    private static String PLAIN = "Plain";
    private static String MAYONNAISE = "Mayonnaise";
    private static String THOUSANDISLANDS = "Thousand Islands";
    private static String BARBECUE = "Barbecue";
    private static String LETTUCE = "Lettuce";
    private static String ONION = "Onion";
    private static String PICKLE = "Pickle";
    private static String CHILI = "Chili";
    private static String MUSHROOM = "Mushroom";
    private static String SHRIMP = "Shrimp";
    private static String CHEESE = "Cheese";

    private final String roll;
    private final int burgers;
    private final String sauce;
    private ArrayList<String> ingredients = new ArrayList<>();

    private BigMac(final String roll, final int burgers, final String sauce, final ArrayList<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigMacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private ArrayList<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(final String roll) throws IllegalStateException {
            if (roll.equals(SESAME) || roll.equals(PLAIN)) {
                this.roll = roll;
                return this;
            } else if (roll.length() == 0) {
                throw new IllegalStateException("Pick a roll, with sesame or without?");
            } else {
                throw new IllegalStateException("There is only choice of two rolls: Sesame or Plain");
            }
        }

        public BigMacBuilder burgers(final int burgers) throws IllegalStateException {
            if (burgers >= 1 && burgers <= 4) {
                this.burgers = burgers;
                return this;
            } else {
                throw new IllegalStateException("Please sect number of burgers (maximum 4)");
            }
        }

        public BigMacBuilder sauce(String sauce) throws IllegalStateException, NullPointerException {
            if (sauce.equals(MAYONNAISE) || sauce.equals(THOUSANDISLANDS) || sauce.equals(BARBECUE)) {
                this.sauce = sauce;
                return this;
            } else if (sauce == null) {
                throw new NullPointerException("Pick a sauce");
            } else {
                throw new IllegalStateException("There is only choice of three sauces: Mayonnaise, Thousand Islands or Barbecue");
            }
        }

        public BigMacBuilder ingredients(String ingredient) throws IllegalStateException, NullPointerException {
            if (ingredient.equals(LETTUCE) || ingredient.equals(ONION) || ingredient.equals(PICKLE) || ingredient.equals(CHILI) || ingredient.equals(MUSHROOM) || ingredient.equals(SHRIMP) || ingredient.equals(CHEESE)) {
                ingredients.add(ingredient);
                return this;
            } else if (ingredients.isEmpty()) {
                throw new NullPointerException("Pick an ingredient");
            } else {
                throw new IllegalStateException("There are following options of ingredients: Lettuce, Onion, Pickle, Chili, Mushroom, Shrimp or Cheese");
            }
        }

        public BigMac build() {
            return new BigMac(roll, burgers, sauce, ingredients);
        }
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
