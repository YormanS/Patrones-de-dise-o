package com.example.trofeo.abstractfactorypattern;

public class FillingFatory extends AbstractFactory{
    @Override
    Bread getBread(String breadType) {
        return null;
    }

    @Override
    Filling getFilling(String fillingType) {

        switch (fillingType) {
            case "CHE":
                return new Cheese();
            case "TOM":
                return new Tomato();
            case "HAM":
                return new Ham();
        }
        return null;
    }

    @Override
    Drink getDrink(String drinkType) {
        return null;
    }
}
