package com.max.task.javafundamentals.task6.service;

public class MatrixService {

    public int[][] fillMatrix(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Array can't be null");
        }

        int[][] matrix = new int[arr.length][arr.length];
        int step = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                matrix[i][j] = arr[(j + step) % arr.length];
            }
            step++;
        }
        return matrix;
    }

    public void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
