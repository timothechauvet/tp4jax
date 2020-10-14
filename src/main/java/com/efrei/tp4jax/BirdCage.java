package com.efrei.tp4jax;

import java.util.ArrayList;

public class BirdCage {
    ArrayList<Bird> birds;

    public BirdCage() {
        birds = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "BirdCage{" +
                "birds=" + birds +
                '}';
    }

    public String toString(int index) {
        if(birds.get(index) != null) {
            return birds.get(index).toString();
        }
        return "Index out of bounds !";
    }

    public String toString(String name) {
        for(Bird currBird : birds) {
            if(currBird.correctName(name)) {
                return currBird.toString();
            }
        }
        return "No such bird found !";
    }
}