package com.example.trofeo.abstractfactorypattern;

public class SandwichBuilder {

    static Sandwich cheeseAndHam(){

        Sandwich sandwich = new Sandwich();

        sandwich.addIngredient(new Slice());
        sandwich.addIngredient(new Ham());
        sandwich.addIngredient(new Cheese());

        return sandwich;
    }

    public static Sandwich build(Sandwich sandwich, Ingredient ingredient){
        sandwich.addIngredient(ingredient);

        return sandwich;
    }
}
