package com.max.task.javafundamentals.task7;

import com.max.task.javafundamentals.task7.service.ShellSort;

import java.util.Arrays;

/**
 * Main class of application.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] array = {14, 5, 2, 66, 20};
        System.out.println("Array before sorting: " + Arrays.toString(array));

        ShellSort shellSort = new ShellSort();
        shellSort.sort(array);

        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
