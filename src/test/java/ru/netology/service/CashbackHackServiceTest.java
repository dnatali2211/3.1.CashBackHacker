package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void remainIfBelowBoundary() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(999), 1);
    }

    @Test
    public void remainIfEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void remainIfZero() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void remainIfAboveBoundary() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1001), 999);
    }
}