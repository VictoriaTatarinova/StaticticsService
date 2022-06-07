package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {
    StatisticsService service = new StatisticsService();

    @Test
    void findMax() {

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxInside() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 13, 8, 6, 11, 11, 12};
        long expected = 13;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxOut() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 22};
        long expected = 22;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}
