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

        // targilon:
        // 1. create an instance of your car with your car details
        //    if you do not have a car then make up a dream car
        // 2. add a function called fuelUp in class Car
        //    which prints "filling up fuel."
        //    execute this function from main
        // 3. create a class called Dog
        //    place data: name, color
        // 4. create an instance of Dog called Rexi with a brown color
        // 5. create an instance of Dog called Max with a white color
        // 6. create a method called bark which print "haw haw..."
        // 7. execute the bark function from main


    }
}
