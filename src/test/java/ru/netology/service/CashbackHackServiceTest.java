package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remainIfBelowBoundaryJUnit4() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(999), 1);
    }

    @org.junit.Test
    public void remainIfEqualBoundaryJUnit4() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(1000), 0);
    }

    @org.junit.Test
    public void remainIfZeroJUnit4() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void remainIfAboveBoundaryJUnit4() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(1001), 999);
    }

    @Test
    public void remainIfBelowBoundary() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(999), 1);
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

        Assertions.assertEquals(service.remain(1001), 999);
    }
}