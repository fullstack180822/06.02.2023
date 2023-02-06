package com.company;

import com.company.fruits.*;

public class Main {

    public static void main(String[] args) {

        double d = 1;
        Fruit banana = new Fruit();
        banana.name = "Banana";
        banana.eatTheFruit();

        Fruit apple = new Fruit();
        //apple.slippingOnBanana();

        Banana b = new Banana();
        b.yellowLevel = 20;
        b.slippingOnBanana();

        // targilon:
        // create Apple class which extends Fruit
        // add a function (hint: make apple juice)
        // add a data (hint: red level)
        // create an apple in main
        // set the red level
        // execute make-apple-juice

    }
}
