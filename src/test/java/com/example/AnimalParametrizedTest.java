package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalParametrizedTest {
    private final Animal animal = new Animal();

    @ParameterizedTest
    @MethodSource("provideFoodData") // тест написан с использованием ИИ
    void getFood_returnsCorrectFoodForKnownKind(String animalKind, List<String> expectedFood) throws Exception {
        List<String> actualFood = animal.getFood(animalKind);
        assertEquals(expectedFood, actualFood,
                "Для вида '" + animalKind + "метод должен возвращать соответствующую еду");
    }

    static Stream<Arguments> provideFoodData() {
        return Stream.of(
                Arguments.of("Травоядное", List.of("Трава", "Различные растения")),
                Arguments.of("Хищник", List.of("Животные", "Птицы", "Рыба"))
        );
    }
}