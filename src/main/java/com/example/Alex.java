package com.example;

import java.util.List;

public class Alex extends Lion {
    public Alex (String sex, Feline feline) throws Exception {
        super(sex, feline);
    }

    public List<String> getFriends() {

        return List.of("Марти", "Глория", "Мелман");
    }
    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}