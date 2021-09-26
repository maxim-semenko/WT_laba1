package com.max.task.javafundamentals.task4.service;

public class PrimeNumberService {

    public PrimeNumberService() {
    }

    public boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
