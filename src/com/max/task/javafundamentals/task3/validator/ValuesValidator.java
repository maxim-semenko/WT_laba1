package com.max.task.javafundamentals.task3.validator;

public class ValuesValidator {

    public static void validate(double a, double b, double h) {
        if (a > b || (h < 0 || h > a || h > b)) {
            throw new IllegalArgumentException("Invalid data");
        }
    }
}
