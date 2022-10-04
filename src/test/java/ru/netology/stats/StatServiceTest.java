package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void shouldMinPrices(){
        StatsService service = new StatsService();

        long[] sales = {15, 10, 5, 4, 3, 1};
        long expectedMouth = 6;
        long actualMouth = service.minSales(sales);

        Assertions.assertEquals(expectedMouth, actualMouth);
    }

    @Test
    public void shouldMaxPrices(){
        StatsService service = new StatsService();

        long[] sales = {15, 10, 5, 4, 3, 1};
        long expectedMouth = 1;
        long actualMouth = service.maxSales(sales);

        Assertions.assertEquals(expectedMouth, actualMouth);
    }

    @Test
    public void shouldAllPrice(){
        StatsService service = new StatsService();

        long[] items = {1, 2, 3, 4 ,5, 6, 7, 8, 9, 10, 11, 12};

        long expected = 78;
        long actual = service.sumSales(items);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSum(){
        StatsService service = new StatsService();

        long[] items = {12,13,1,5,6};

        long expected = 7;
        long actual = service.average(items);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthsWithMore(){
        StatsService service = new StatsService();

        long[] items = {12,13,8,5,5};

        long expected = 2;
        long actual = service.mouthWithMoreThanAverage(items);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthWithLess() {
        long[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long expected = 9;
        long actual = statsService.minSales(items);

        Assertions.assertEquals(expected, actual);

    }


}
