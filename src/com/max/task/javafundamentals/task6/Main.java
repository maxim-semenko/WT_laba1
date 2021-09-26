package com.max.task.javafundamentals.task6;

import com.max.task.javafundamentals.task6.service.MatrixService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrixService matrixService = new MatrixService();

        System.out.println("Please, enter array size: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Please, enter array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        try {
            int[][] matrix = matrixService.fillMatrix(array);
            matrixService.printMatrix(matrix);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
