package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {
    private final Feline feline = new Feline();

    @Test
    void eatMetReturnsPredatorFood() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food,"Метод должен вернуть Животные, Птицы, Рыба");
    }
    @Test
    void getFoodReturnsPredatorFood() throws Exception {
        List<String> food = feline.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food,
                "getFood должен возвращать еду хищника (через eatMeat)");
    }

    @Test
    void getFamilyReturnsFeline() {
        assertEquals("Кошачьи", feline.getFamily(),
                "Семейство должно быть Кошачьи");
    }

    @Test
    void getKittensReturnOne() {
        assertEquals(1, feline.getKittens());
    }
}

