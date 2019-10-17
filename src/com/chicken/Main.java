package com.chicken;

public class Main {

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Egg<Chicken> egg = chicken.lay();
        try {
            Chicken chicken2 = egg.hatch();
            Egg<Chicken> egg2 = chicken2.lay();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
