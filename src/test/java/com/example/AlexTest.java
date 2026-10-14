package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
public class AlexTest {
    @Mock
    Kittens kittens;

    @Mock
    Food food;
    @Test
    void getPlaceOfLivingReturnNewYorkZoo() throws Exception  {
        Alex alex = new Alex("Самец", kittens, food);
        assertEquals("Нью-Йоркский зоопарк",alex.getPlaceOfLiving(),
                "Алекс должен жить в Нью-Йоркском зоопарке");
    }

    @Test
    void getFriendsReturnsSizeThree() throws Exception {
        Alex alex = new Alex("Самец", kittens, food);
        List<String> friends = alex.getFriends();
        assertEquals(3, friends.size(), "У Алекса должно быть трое друзей");
    }
}