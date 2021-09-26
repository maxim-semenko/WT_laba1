package com.max.task.javafundamentals.task7.service;

/**
 * Class Shell sort that have one method that sort array.
 *
 * @author Maxim Semenko
 */
public class ShellSort {

    /**
     * Empty constructor for creating instance of class.
     */
    public ShellSort() {
    }

    /**
     * Method that sort user's array.
     *
     * @param array array that should to sort
     */
    public void sort(final int[] array) {
        int arrayLength = array.length;
        for (int k = arrayLength / 2; k > 0; k /= 2) {
            for (int i = k; i < arrayLength; i++) {
                int key = array[i];
                int j = i;
                while (j >= k && array[j - k] > key) {
                    array[j] = array[j - k];
                    j -= k;
                }
                array[j] = key;
            }
        }
    }
}
