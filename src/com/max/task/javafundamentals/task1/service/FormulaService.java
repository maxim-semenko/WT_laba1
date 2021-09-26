package com.max.task.javafundamentals.task1.service;

/**
 * FormulaService that have one method for calculation of formula.
 *
 * @author Maxim Semenko
 */
public class FormulaService {

    /**
     * Empty constructor for creating instance of class.
     */
    public FormulaService() {
    }

    /**
     * Method that calculate formula from task.
     *
     * @param x {@link Double} user's input x
     * @param y {@link Double} user's input y
     * @return {@link Double} calculation's result
     */
    public double doCalculation(final double x, final double y) {
        double numerator = (1 + Math.pow(Math.sin(x + y), 2));
        double denominator = (2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2))));
        double fraction = numerator / denominator;

        return fraction + x;
    }

}
