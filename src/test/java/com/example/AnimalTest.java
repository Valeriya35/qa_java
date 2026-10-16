package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    void getFood_throwsExceptionForUnknownKind() {
        Exception thrown = assertThrows(
                Exception.class,
                () -> animal.getFood("Всеядное")
        );
        assertTrue(
                thrown.getMessage().contains("Неизвестный вид животного"),
                "Сообщение об ошибке должно содержать текст о неизвестном виде животного"
        );
    }

    @Test
    void getFamily_returnsGeneralFamilyDescription() {
        String family = animal.getFamily();
        assertNotNull(family, "Описание семейств не должно быть null");
        assertFalse(family.isEmpty(), "Описание семейств не должно быть пустым");
        assertTrue(family.toLowerCase().contains("кошачьи"),
                "В описании семейств должно упоминаться кошачьи"
        );
    }
}
