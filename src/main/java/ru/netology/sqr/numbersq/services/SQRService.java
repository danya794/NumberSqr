package ru.netology.sqr.numbersq.services;

public class SQRService {


    public int calcSQRS(int x) {
        int valueMin = 10;
        int valueMax = 99;
        int j = 0;
        for (int i = 0; i <= valueMax; i++) {

            if (i * i >= valueMin && i * i <= valueMax) {
                System.out.println(i);

            }
        }
        return j;
    }
}



//    int x = 99;
//
//    public int calcSQRS(int x) {
//        for (int i = 10; i <= x; i++) {
//            if (i * i >= x) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}

//    int znachMin = 10;
//    int znachMax = 99;
//    int i = 0;
//    int j = 0;

//for (int i = 0; i <= znachMax; i++) {
//
//        if (i * i >= znachMin && i * i <= znachMax) {
//        System.out.println(i);
//        j++;
//        }
//        }
//        return j;