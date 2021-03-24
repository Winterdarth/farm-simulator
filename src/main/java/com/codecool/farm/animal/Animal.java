package com.codecool.farm.animal;

public abstract class Animal {

    public Animal(int size) {
        this.size = size;
    }

    public Animal() {
    }

    private int size = 0;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public abstract void feed();
}
