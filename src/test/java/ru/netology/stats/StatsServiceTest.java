package ru.netology.stats;


import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void sumArray() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sumArray(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageAmountofSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.averageAmountofSales(sales);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void peakSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.peakSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void declineSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.declineSales(sales);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void belowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.belowAverage(sales);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void aboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.aboveAverage(sales);

        assertEquals(expected, actual);
    }
}