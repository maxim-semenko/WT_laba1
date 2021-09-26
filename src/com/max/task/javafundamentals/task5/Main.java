package com.max.task.javafundamentals.task5;

import com.max.task.javafundamentals.task5.service.FindMinElementsService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindMinElementsService findMinElements = new FindMinElementsService();

        System.out.println("Please, enter array size: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Please, enter array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        try {
            System.out.println("Min Amount for extracting: " + findMinElements.getMinElements(array));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
