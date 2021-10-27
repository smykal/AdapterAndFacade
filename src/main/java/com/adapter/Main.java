package com.adapter;

public class Main {
    public static void main(String[] args) {
        Duck duck = new WildDuck();
        Turkey turkey = new WildTurkey();
        Duck adapterTurkey = new AdapterTurkey(turkey);

        duck.fly();
        duck.quack();

        turkey.fly();
        turkey.gulgul();

        adapterTurkey.fly();
        adapterTurkey.quack();
    }
}
