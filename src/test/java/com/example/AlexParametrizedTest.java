package com.example;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)

public class AlexParametrizedTest {
    @Mock
    Kittens kittens;

    @Mock
    Food food;

    @ParameterizedTest(name = "Друг {0} должен быть в списке друзей Алекса") //Тест написан с помощью ИИ, чтобы он был параметризован
    @ValueSource(strings = {"Марти", "Глория", "Мелман"})
    void getFriendsReturnsCorrectName(String friendName) throws Exception {
        Alex alex = new Alex("Самец", kittens, food);
        List<String> friends = alex.getFriends();
        assertTrue(friends.contains(friendName), "Друг '" + friendName + "' должен быть в списке друзей");
    }
}
