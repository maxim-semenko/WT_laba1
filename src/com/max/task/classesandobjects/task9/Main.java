package com.max.task.classesandobjects.task9;

import com.max.task.classesandobjects.task9.entity.Ball;
import com.max.task.classesandobjects.task9.entity.Basket;
import com.max.task.classesandobjects.task9.entity.Color;
import com.max.task.classesandobjects.task9.service.BasketService;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        BasketService basketService = new BasketService(basket);
        basketService.addBall(new Ball(200, Color.BLUE));
        basketService.addBall(new Ball(150, Color.GREEN));
        basketService.addBall(new Ball(400, Color.BLUE));

        System.out.println("The basket's weight: " + basketService.getWeight());
        System.out.println("The count of blue balls: " + basketService.getCountByColor(Color.BLUE));

    }
}
