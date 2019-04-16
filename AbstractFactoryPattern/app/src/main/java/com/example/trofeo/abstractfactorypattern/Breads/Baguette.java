package com.example.trofeo.abstractfactorypattern;

public class Baguette extends Bread{
    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public int calories() {
        return 250;
    }

    @Override
    public String description() {
        return "Un baguette recien hecha y muy buena";
    }

    @Override
    public String image() {
        return null;
    }
}
