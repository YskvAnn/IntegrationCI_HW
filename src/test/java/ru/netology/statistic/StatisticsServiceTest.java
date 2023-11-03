package ru.netology.statistic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findNewMax() {

        StatisticsService service = new StatisticsService();

        long[] incomesBillions = {12, 5, 8, 4, 5, 17, 8, 6, 11, 11, 12};

        long expected = 17;

        long actual = service.findMax(incomesBillions);
        Assertions.assertEquals(expected, actual);
    }
}