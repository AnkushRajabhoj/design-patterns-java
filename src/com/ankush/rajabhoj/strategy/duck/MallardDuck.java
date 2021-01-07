package com.ankush.rajabhoj.strategy;

import com.ankush.rajabhoj.strategy.flying.FlyWithWings;
import com.ankush.rajabhoj.strategy.quacking.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
