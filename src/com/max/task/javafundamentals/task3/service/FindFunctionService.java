package com.max.task.javafundamentals.task3.service;

public final class FindFunctionService {

    public double[][] findAnswer(double a, double b, double h) {
        double x = a;
        double[][] arr = initArray(a, b, h);

        for (int j = 0; j < arr[0].length; j++) {
            arr[0][j] = x;
            arr[1][j] = Math.tan(x);
            x += h;
        }

        return arr;
    }

    private static double[][] initArray(double a, double b, double h) {
        int size = (int) ((b - a) / (Math.abs(h))) + 1;
        return new double[2][size];
    }
}
