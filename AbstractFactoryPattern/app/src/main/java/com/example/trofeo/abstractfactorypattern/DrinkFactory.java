package com.example.trofeo.abstractfactorypattern;

class DrinkFactory extends AbstractFactory {
    @Override
    Bread getBread(String breadType) {
        return null;
    }

    @Override
    Filling getFilling(String fillingType) {
        return null;
    }

    @Override
    Drink getDrink(String drinkType) {

        if (drinkType.equals("COK")){
            return new Coke();
        }else if (drinkType.equals("BEE")){
            return new Beer();
        }
        return null;
    }
}
