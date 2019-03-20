package com.example.trofeo.abstractfactorypattern;

public class Ham implements Filling{
    @Override
    public String name() {
        return "Jamon";
    }

    @Override
    public String calories() {
        return ": 1 kcal";
    }
}
