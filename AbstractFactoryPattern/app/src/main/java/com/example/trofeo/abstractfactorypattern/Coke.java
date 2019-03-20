package com.example.trofeo.abstractfactorypattern;

public class Coke implements Drink{
    @Override
    public String name() {
        return "Cocacola";
    }

    @Override
    public String calories() {
        return ": 140 kcal";
    }
}
