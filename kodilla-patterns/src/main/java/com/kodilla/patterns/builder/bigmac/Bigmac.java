package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    public static final String BUN_WITH_SESAME = "Bun with sesame";
    public static final String BUN_WITHOUT_SESAME = "Bun without sesame";
    private final int burgers;
    private final String sauce;
    public static final String STANDARD = "Standard";
    public static final String THOUSAND_ISLAND = "1000 islands";
    public static final String BARBECUE = "barbecue";
    private final List<String> ingredients;
    public static final String LETTUCE = "lettuce";
    public static final String ONION = "onion";
    public static final String BACON = "bacon";
    public static final String CUCUMBER = "cucumber";
    public static final String CHILI_PEPPERS = "chili peppers";
    public static final String MUSHROOMS = "mushrooms";
    public static final String SHRIMPS = "shrimps";
    public static final String CHEESE = "cheese";


    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(String ingredients) {
            this.ingredients.add(ingredients);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}