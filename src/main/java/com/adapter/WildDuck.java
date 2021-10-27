package com.adapter;

public class WildDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack! quack!");
    }

    @Override
    public void fly() {
        System.out.println("Fly! fly!");
    }
}
