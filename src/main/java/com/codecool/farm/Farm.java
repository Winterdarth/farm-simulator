package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private static List<Animal> animals = new ArrayList<>();

    public static List<Animal> getAnimals() {
        return animals;
    }

    public Farm(List<Animal> animals) {
        this.animals =animals;
    }

    public void feedAnimals (){
        for (int i = 0; i < animals.size() ; i++) {
            animals.get(i).feed();
        }
    }

    public void butcher(Butcher butcher) {
        for (int i = 0 ; i < animals.size(); i++ ) {
            if(butcher.canButcher( animals.get(i))) {
                animals.remove(i);
            }

        }
    }

    public boolean isEmpty() {
        if (animals.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public List<String> getStatus() {
        List<String > status = new ArrayList<>();
        for(int i=0 ; i < animals.size() ;i ++){

            String temp = "There is a " + animals.get(i).getSize() + " sized " + animals.get(i).toString()+ "in the farm.";
            status.add(temp);
        }
        return status;
    }

}