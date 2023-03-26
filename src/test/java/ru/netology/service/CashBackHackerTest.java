//package ru.netology.service;
//
//import org.testng.annotations.Test;
//
//import static org.testng.Assert.*;
//
//public class CashBackHackerTest {
//
//    @Test
//    void purchaseFor999 () {
//        CashBackHacker cashBackHacker = new CashBackHacker();
//        int amount = 999;
//
//        int actual = cashBackHacker.remain(amount);
//        int expected = 1;
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    void purchaseFor1000 () {
//        CashBackHacker cashBackHacker = new CashBackHacker();
//        int amount = 1000;
//
//        int actual = cashBackHacker.remain(amount);
//        int expected = 0;
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    void purchaseFor1001 () {
//        CashBackHacker cashBackHacker = new CashBackHacker();
//        int amount = 1001;
//
//        int actual = cashBackHacker.remain(amount);
//        int expected = 999;
//
//        assertEquals(actual, expected);
//    }
//}