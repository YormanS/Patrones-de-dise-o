package com.example.trofeo.abstractfactorypattern;

public class Roll extends Bread{
    @Override
    public String name() {
        return "Pan de pita";
    }

    @Override
    public int calories() {
        return 169;
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
