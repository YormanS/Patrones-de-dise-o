package com.example.trofeo.abstractfactorypattern;

class FactoryGenerator {

    static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }

        switch (factoryType) {
            case "BRE":
                return new BreadFactory();
            case "FIL":
                return new FillingFatory();
            case "DRI":
                return new DrinkFactory();
        }

        return null;
    }
}
