package com.max.task.javafundamentals.task5.service;

public class FindMinElementsService {

    public FindMinElementsService() {
    }

    public int getMinElements(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array is empty");
        }

        int maxIncLen = 0;
        int curInLen;
        boolean isIncrease;

        for (int i = 0; i < array.length; i++) {
            isIncrease = true;
            curInLen = 1;
            for (int j = i + 1; (j < array.length) && isIncrease; j++) {
                if (array[j - 1] < array[j]) {
                    curInLen++;
                } else {
                    isIncrease = false;
                }
            }
            maxIncLen = Math.max(maxIncLen, curInLen);
        }
        return array.length - maxIncLen;
    }
}
