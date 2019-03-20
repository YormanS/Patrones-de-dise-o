package com.example.trofeo.abstractfactorypattern;

public class Ham extends Filling{
    @Override
    public String name() {
        return "Jamon";
    }

    @Override
    public int calories() {
        return 1;
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
