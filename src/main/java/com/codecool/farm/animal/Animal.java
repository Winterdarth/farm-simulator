package com.codecool.farm.animal;

public abstract class Animal {

    private int size = 0;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Animal(int size) {
        this.size = size;
    }
    public Animal() {

    }

    public abstract void feed();

}
