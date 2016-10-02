package com.company;

import java.util.Random;

public class Main {
    static final    int Length = 10;
    static int[] array = new int [Length];
        public static void q_sort(int begin, int end) {
            int middle = array[begin + (end - begin) / 2];
            int i = begin;
            int j = end;
            while (i <= j) {
                while (array[i] < middle) {
                    i++;
                }
                while (array[j] > middle) {
                    j--;
                }
                if (i <= j) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                    i++;
                    j--;
                }
                if (j > begin) {
                    q_sort(begin, j);
                }
                if (i < end) {
                    q_sort(i, end);
                }
            }
        }

    public static void main(String[] args){
        Random rnd = new Random();
        for (int i = 0; i < Length; i++) {
            array[i] = rnd.nextInt();
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        q_sort(0,Length - 1);
        for (int i = 0; i < Length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}

