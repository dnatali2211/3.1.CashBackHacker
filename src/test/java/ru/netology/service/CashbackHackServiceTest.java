package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void remainIfBelowBoundary() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(900), 100);
    }

    @Test
    public void remainIfEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void remainIfZero() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void remainIfAboveBoundary() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(1567), 433);
    }
}