package com.codecool.farm.animal;

public class Pig extends Animal {

    @Override
    public void feed() {
        int previousSize = this.getSize();
        previousSize += 1;
        this.setSize(previousSize);
    }

    @Override
    public String toString() {
        return "pig ";
    }
}
