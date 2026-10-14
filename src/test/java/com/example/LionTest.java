package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LionTest {
    @Mock
    Kittens kittens;

    @Mock
    Food food;
    @Test
    void doesHaveManeMaleReturnsTrue()  throws Exception {
        Lion lion = new Lion("Самец", kittens, food);
        assertTrue(lion.doesHaveMane(),"У самца должна быть гривы");
    }
    @Test
    void doesHaveManeFemaleReturnsFalse()  throws Exception {
        Lion lion = new Lion("Самка", kittens, food);
        assertFalse(lion.doesHaveMane(),"У самки не должно быть грива");
    }
    @Test
    void doesHaveManeUnknownSexException () { // Тест написан с помощью ИИ
        Exception thrown = assertThrows(
                Exception.class, () -> new Lion("Котопес", kittens, food));
        assertTrue(thrown.getMessage().contains("Используйте допустимые значения пола животного - самец или самка"),
                "Конструктор должен выбрасывать исключение при недопустимом значении пола");
    }
    @Test
    void getKittensReturnExpectedKittens() throws Exception {
        int expectedKittens = 5;
        when(kittens.getKittens()).thenReturn(expectedKittens);
        Lion lion = new Lion ("Самец", kittens, food);
        assertEquals(expectedKittens, lion.getKittens(), "Метод должен возвращать ожидаемое количество котят(5)");

    }

    @Test
    void getFoodReturnsFoodPredator() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(food.getFood()).thenReturn(expectedFood);

        Lion lion = new Lion("Самка", kittens, food);
        List<String> actualFood = lion.getFood();

        assertEquals(expectedFood, actualFood, "метод должен возвращать еду для хищника");
    }
}