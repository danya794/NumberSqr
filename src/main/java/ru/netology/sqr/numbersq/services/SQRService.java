package ru.netology.sqr.numbersq.services;

public class SQRService {


    public int calcSQRS(int min, int max) {

        int counter = 0;
        for (int i = 0; i <= max; i++) {
            if (i * i >= min && i * i <= max) {
                counter++;
            }
        }
        return counter;
    }
}
