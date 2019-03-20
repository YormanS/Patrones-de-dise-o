package com.example.trofeo.abstractfactorypattern;

public  class BreadFactory extends AbstractFactory {
    @Override
    Bread getBread(String breadType) {

        switch (breadType) {
            case "BAG":
                return new Baguette();
            case "ROL":
                return new Roll();
            case "SLI":
                return new Slice();
        }
        return null;
    }

    @Override
    Filling getFilling(String fillingType) {
        return null;
    }

    @Override
    Drink getDrink(String drinkType) {
        return null;
    }
}
