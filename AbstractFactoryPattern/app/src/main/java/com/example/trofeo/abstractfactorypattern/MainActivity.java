package com.example.trofeo.abstractfactorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Sandwich sandwich = SandwichBuilder.cheeseAndHam();

        Log.d(TAG, "Primer sandwich");
        sandwich.getIngredient();
        sandwich.getCalories();

        Sandwich sandwich1 = SandwichBuilder.cheeseAndHam();
        SandwichBuilder.build(sandwich1,new Tomato());

        Log.d(TAG, "Segundo sandwich");
        sandwich1.getIngredient();
        sandwich1.getCalories();


        Sandwich sandwich2 = new Sandwich();
        SandwichBuilder.build(sandwich2,new Baguette());
        SandwichBuilder.build(sandwich2,new Cheese());

        Log.d(TAG, "Tercer sandwich");
        sandwich2.getIngredient();
        sandwich2.getCalories();
    }
}
