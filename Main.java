package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] Array = new int[10];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 101);
            //заполнение массива случайными целыми числами от 0 до 100
        }
        System.out.println("Исходный массив:\n" + Arrays.toString(Array));
        InsertionSort(Array);
    }

    public static void InsertionSort(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            int pos = i;
            int min = sortArray[i];
            int j = i + 1;
            for (;j <sortArray.length; j++) {
                if (sortArray[j] <min) {
                    pos = j;
                    min = sortArray[j];
                }
            }
            sortArray[pos] = sortArray[i];
            sortArray[i] = min;
        }
        System.out.println("Конечный массив:\n" + Arrays.toString(sortArray));
    }
}