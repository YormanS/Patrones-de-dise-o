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

        AbstractFactory fillingFatory = FactoryGenerator.getFactory("FIL");
        Filling filling = fillingFatory.getFilling("TOM");

        Log.d(TAG, filling.name() + filling.calories());

        AbstractFactory breadFactory = FactoryGenerator.getFactory("BRE");
        Bread bread = breadFactory.getBread("BAG");
        Log.d(TAG, bread.name() + bread.calories());
    }
}
