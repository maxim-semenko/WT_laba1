package com.max.task.javafundamentals.task4;

import com.max.task.javafundamentals.task4.service.PrimeNumberService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeNumberService primeNumberService = new PrimeNumberService();

        System.out.println("Please, enter array size: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Please, enter array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Prime number's array positions: ");
        for (int i = 0; i < n; i++) {
            if (primeNumberService.isPrimeNumber(array[i])) {
                System.out.println(i + " ");
            }
        }
    }
}
