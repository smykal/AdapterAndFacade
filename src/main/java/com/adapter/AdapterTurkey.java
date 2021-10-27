package com.adapter;

public class AdapterTurkey implements Duck {
    Turkey turkey;

    public AdapterTurkey(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gulgul();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
