package com.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    void getSoundReturnMeow() {
        Cat cat = new Cat(feline);
        String sound = cat.getSound();
        assertEquals("Мяу", sound, "метод должен вернуть Мяу");
        assertNotNull(sound, "Звук не должен быть null");
        assertFalse(sound.isEmpty(), "Звук должен быть");
    }

    @Test
    void getFoodReturnsEatMeat() throws Exception {
        Cat cat = new Cat(feline);
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = cat.getFood();
        Assertions.assertEquals(List.of("Животные", "Птицы", "Рыба"),food);
    }

}
