package com.max.task.javafundamentals.task3;

import com.max.task.javafundamentals.task3.service.FindFunctionService;
import com.max.task.javafundamentals.task3.service.PrintTableService;
import com.max.task.javafundamentals.task3.validator.ValuesValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintTableService printTableService = new PrintTableService();
        FindFunctionService findFunctionService = new FindFunctionService();

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter h: ");
        double h = scanner.nextDouble();

        try {
            ValuesValidator.validate(a, b, h);
            double[][] arr = findFunctionService.findAnswer(a, b, h);
            printTableService.printArray(arr);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
