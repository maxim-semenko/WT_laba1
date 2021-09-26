package com.max.task.javafundamentals.task2.service;

import com.max.task.javafundamentals.task2.entity.Point;

public class PointService {

    private static final int UPPER_X1 = -4;
    private static final int UPPER_X2 = 4;
    private static final int UPPER_Y1 = 0;
    private static final int UPPER_Y2 = 5;

    private static final int LOWER_X1 = -6;
    private static final int LOWER_X2 = 6;
    private static final int LOWER_Y1 = -3;
    private static final int LOWER_Y2 = 0;

    public PointService() {
    }

    public boolean check(Point point) {
        return ((point.getY() <= UPPER_Y2) && (point.getY() >= UPPER_Y1)
                && (point.getX() <= UPPER_X2) && (point.getX() >= UPPER_X1))
                || ((point.getY() >= LOWER_Y1) && (point.getY() <= LOWER_Y2)
                && (point.getX() <= LOWER_X2) && (point.getX() >= LOWER_X1));
    }
}
