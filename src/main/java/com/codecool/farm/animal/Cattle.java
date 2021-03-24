package com.codecool.farm.animal;

public class Cattle extends Animal {

    public Cattle(int size) {
        super(size);
    }

    public Cattle() {
    }

    @Override
    public void feed() {
        int previousSize = this.getSize();
        previousSize += 2;
        this.setSize(previousSize);
    }

    @Override
    public String toString() {
        return "cattle ";
    }
}
