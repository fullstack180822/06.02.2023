package com.company;

public class Main {

    public static void main(String[] args) {
        CreditCard masterCard = new CreditCard();

        masterCard.number = "2580-1234-1234-1234";
        masterCard.secretCode = "1234";

        System.out.println(masterCard.secretCode);
        masterCard.secretCode = "ha ha ha ";

        Exam history = new Exam();
        history.subject = "History of middle age";
        history.grade = -100;

        Person danny = new Person();
        danny.name = "danny";

        //danny.height = -20.5f;
        //System.out.println(danny.height);

        // Create BankAccount class
        // create field called balance (private)
        // create method deposit which increase the balance -- print the balance after the operation
        // create method withdraw which decrease the balance -- print the balance after the operation

    }
}
