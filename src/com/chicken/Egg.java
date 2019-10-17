package com.chicken;

import java.util.concurrent.Callable;

class Egg <B extends Bird> {

    private Callable<B> createBird;

    Egg(Callable<B> createBird) {
        this.createBird = createBird;
    }

    B hatch() throws Exception {
        if(this.createBird == null) {
            throw new IllegalStateException();
        }
        try {
            System.out.println("The egg was hatched");
            return createBird.call();
        } finally {
            this.createBird = null;
        }
    }
}
