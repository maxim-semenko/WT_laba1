package com.max.task.javafundamentals.task2;

import com.max.task.javafundamentals.task2.entity.Point;
import com.max.task.javafundamentals.task2.service.PointService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointService pointService = new PointService();

        System.out.print("Input x: ");
        double x = scanner.nextDouble();

        System.out.print("Input y: ");
        double y = scanner.nextDouble();

        Point point = new Point(x, y);
        System.out.println(pointService.check(point));
    }
}
