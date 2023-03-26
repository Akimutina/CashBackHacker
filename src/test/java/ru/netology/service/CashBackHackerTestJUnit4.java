package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTestJUnit4 {

    @Test
    public void purchaseFor999 () {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 999;

        int actual = cashBackHacker.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void purchaseFor1000 () {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void purchaseFor1001 () {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1001;

        int actual = cashBackHacker.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

}