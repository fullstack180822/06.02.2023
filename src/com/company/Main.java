package com.company;

public class Main {

    public static void main(String[] args) {

        double d = 1;

        //Main m = new Main();
        //Main.main( null );

        Car mistubishi = new Car(); // create new car instance

        System.out.println(mistubishi);

        mistubishi.type = "Mitsubishi";
        mistubishi.color = "Black";
        mistubishi.speed = 100;
        mistubishi.model = "Lancer";

        mistubishi.start();
        mistubishi.stop();

        mistubishi.printAllData();


        Car toyota = new Car(); // create new car instance



    }
}
