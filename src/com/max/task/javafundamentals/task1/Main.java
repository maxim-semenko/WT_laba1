package com.max.task.javafundamentals.task1;

import com.max.task.javafundamentals.task1.service.FormulaService;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        FormulaService formulaService = new FormulaService();

        System.out.print("Input x: ");
        float x = scanner.nextFloat();

        System.out.print("Input y: ");
        float y = scanner.nextFloat();

        System.out.println("Your result: " + formulaService.doCalculation(x, y));
    }
}
