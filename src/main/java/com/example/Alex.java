package com.example;

import java.util.List;

public class Alex extends Lion {
    public Alex (String sex, Kittens kittens, Food food) throws Exception {
        super(sex, kittens, food);
    }
    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }
    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}