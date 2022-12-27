package ru.netology.sqr.numbersq.services;

public class SQRService {

    int znach_min = 10;
    int znach_max = 99;
    int i = 0;
    int j = 0;

    public int calcSqrt(int x) {
        for (int i = 0; i <= znach_max; i++) {

            if (i * i >= znach_min && i * i <= znach_max) {
                System.out.println(i);
                j++;
            }
        }
        return j;
    }
}