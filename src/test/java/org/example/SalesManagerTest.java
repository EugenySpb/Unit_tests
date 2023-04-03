package org.example;

import org.junit.jupiter.api.Assertions;

class SalesManagerTest {

    @org.junit.jupiter.api.Test
    public void testMax() {
        long[] sales = {100, 200, 300, 150, 50};
        SalesManager max = new SalesManager(sales);
        long actual = max.max();
        long expected = 300;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testMin() {
        long[] sales = {100, 200, 300, 150, 50};
        SalesManager min = new SalesManager(sales);
        long actual = min.min();
        long expected = 50;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testStatistics() {
        long[] sales = {100, 200, 300, 150, 50};
        SalesManager statistics = new SalesManager(sales);
        long actual = statistics.statistics();
        long expected = 150;
        Assertions.assertEquals(expected, actual);
    }
}