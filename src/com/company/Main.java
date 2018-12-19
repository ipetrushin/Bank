package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // может и работает
        int k = sc.nextInt();
        int[] a = new int[k];

        for (int i = 0; i < k; i++) {
            // считать число
            a[i] = sc.nextInt();
            // записать число в ячейку массива
        }
        int n = 0;
        for (int i = 0; i < k-1; i++) {
            if (a[i+1] > a[i])
            {
                n++;
            }
        }
        System.out.println(n);

    }
}
