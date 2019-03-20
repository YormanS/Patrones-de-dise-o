package com.example.trofeo.abstractfactorypattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private List<Ingredient> ingredients = new ArrayList<>();
    private static final String TAG = "Sandwich";

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void getCalories() {
        int calories = 0;

        for (Ingredient i : ingredients) {
            calories += i.calories();
        }
        Log.d(TAG, "getCalories: " + calories + " kcal");
    }

    public void getIngredient() {
        for (Ingredient i : ingredients) {
            Log.d(TAG, i.name() + " : " + i.calories() + " kcal");
        }
    }
}
