package ru.netology.sqr.numbersq.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "6, 10, 99",
            "5, 99, 200" })

    public void shouldCalculate(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calcSQRS(min, max);
        Assertions.assertEquals(expected, actual);

    }

    }
