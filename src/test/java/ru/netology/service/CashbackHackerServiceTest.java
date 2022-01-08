package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {
    CashbackHackerService cashbackHackerService = new CashbackHackerService();

    @Test
    public void shouldReturn100Rub() {
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackerService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999Rub() {
        int amount = 1;
        int expected = 999;
        int actual = cashbackHackerService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1Rub() {
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackerService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000Rub() {
        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackerService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500Rub() {
        int amount = 500;
        int expected = 500;
        int actual = cashbackHackerService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0Rub() {
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackerService.remain(amount);
        assertEquals(actual, expected);
    }
}