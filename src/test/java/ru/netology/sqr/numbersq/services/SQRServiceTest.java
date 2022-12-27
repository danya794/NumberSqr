package ru.netology.sqr.numbersq.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.sqr.numbersq.services.SQRService;

public class SQRServiceTest {
    @Test
    public void shouldCaclExact() {
        SQRService service = new SQRService();

        int expected = 1000;
        int actual = service.calcSqrt(1000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcInexact() {
        SQRService service = new SQRService();

        int expected = 1000;
        int actual = service.calcSqrt(1000);

        Assertions.assertEquals(expected, actual);

    }
}
