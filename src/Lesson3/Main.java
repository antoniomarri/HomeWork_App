package Lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        */
        int[] replaceNullOnOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < replaceNullOnOne.length; i++) {
            if (replaceNullOnOne[i] == 1) {
                replaceNullOnOne[i] = 0;
            } else {
                replaceNullOnOne[i] = 1;
            }
        }
        /* 2. Задать пустой целочисленный массив длиной 100.
        С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
         */
        int[] fullArray = new int[100];
        for (int i = 0; i < fullArray.length; i++) {
            fullArray[i] = i + 1;
        }
        /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        int[] lessThenSixMultiplyTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < lessThenSixMultiplyTwo.length; i++) {
            if (lessThenSixMultiplyTwo[i] < 6) {
                lessThenSixMultiplyTwo[i] *= 2;
            }
        }
        /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        */
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
         */
    public static int[] arrLenInitialValue (int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    }


