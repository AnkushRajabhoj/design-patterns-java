package com.ankush.rajabhoj.strategy;

import com.ankush.rajabhoj.strategy.flying.FlyNoWay;
import com.ankush.rajabhoj.strategy.quacking.Quack;

public class ModelDuck  extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
