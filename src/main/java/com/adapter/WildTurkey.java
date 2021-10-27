package com.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gulgul() {
        System.out.println("Gul! gul!");
    }

    @Override
    public void fly() {
        System.out.println("Fly! fly!");
    }
}
