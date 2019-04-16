package com.example.trofeo.abstractfactorypattern;

public class Cheese extends Filling {
    @Override
    public String name() {
        return "Queso";
    }

    @Override
    public int calories() {
        return 52;
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
