package com.max.task.classesandobjects.task9.service;

import com.max.task.classesandobjects.task9.entity.Ball;
import com.max.task.classesandobjects.task9.entity.Basket;
import com.max.task.classesandobjects.task9.entity.Color;

public class BasketService {

    private Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void addBall(Ball ball) {
        basket.getBalls().add(ball);
    }

    public void removeBall(Ball ball) {
        basket.getBalls().remove(ball);
    }

    public double getWeight() {
        double weight = 0;
        for (Ball ball : basket.getBalls()) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getCountByColor(Color color) {
        int count = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getColor().equals(color)) {
                count++;
            }
        }
        return count;
    }
}
