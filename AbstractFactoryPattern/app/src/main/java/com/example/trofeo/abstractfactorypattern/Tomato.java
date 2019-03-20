package com.example.trofeo.abstractfactorypattern;

public class Tomato extends Filling{
    @Override
    public String name() {
        return "Tomate";
    }

    @Override
    public int calories() {
        return 20;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String image() {
        return null;
    }
}
