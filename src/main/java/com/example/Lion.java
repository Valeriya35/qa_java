package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Kittens kittens;
    private final Food food;

    public Lion(String sex, Kittens kittens, Food food) throws Exception {
        if ("Самец".equals(sex)) {
            this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }

        this.kittens = kittens;
        this.food = food;
    }
    public int getKittens() {

        return kittens.getKittens();
    }
    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return food.getFood();
    }
}
