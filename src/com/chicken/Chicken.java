package com.chicken;

import java.util.concurrent.Callable;

public class Chicken implements Bird, Callable<Bird> {

    @Override
    public Egg<Chicken> lay() {
        System.out.println("Chicken laid an egg");
        return new Egg<>(Chicken::new);
    }

    @Override
    public Bird call() {
        return new Chicken();
    }
}
