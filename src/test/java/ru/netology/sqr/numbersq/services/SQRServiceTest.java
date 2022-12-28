package ru.netology.sqr.numbersq.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.numbersq.services.SQRService;

public class SQRServiceTest {
    @Test
    public void shouldCaclExact() {
        SQRService service = new SQRService();

        int expected = 4;
        int actual = service.calcSQRS(16);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcInexact() {
        SQRService service = new SQRService();

        int expected = 10;
        int actual = service.calcSQRS(99);

        Assertions.assertEquals(expected, actual);

    }
}
