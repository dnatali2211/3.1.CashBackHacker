package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void remainIfBelowBoundary() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(900), 100);
    }

    @Test
    public void remainIfEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void remainIfZero() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(0), 0);
    }

    @Test
    public void remainIfAboveBoundary() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1567), 433);
    }
}