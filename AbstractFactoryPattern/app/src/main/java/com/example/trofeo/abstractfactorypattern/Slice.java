package com.example.trofeo.abstractfactorypattern;

public class Slice extends Bread{
    @Override
    public String name() {
        return "Pan de molde";
    }

    @Override
    public int calories() {
        return 80;
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
