package com.company;

public class Person {

    public String name;
    public String id;

    private float height = 5.5f;

    public void babyBorn()
    {
        this.height = 0.8f;
        this.setHeight(0.8f);
    }

    public float getHeight()
    {
        // check if israel --> Meter + Cm
        // if USA --> Feet
        return this.height;
    }

    public void setHeight(float value)
    {
        // print to log
        if (value >= 0.8)
        {
            this.height = value;
        }
        else
        {
            // just an option
            throw new IllegalArgumentException();
        }
    }



}
