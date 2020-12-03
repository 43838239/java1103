package com.ocp10.pet.entity;

import com.ocp10.pet.entity.Pet;

public abstract class Dog implements Pet {

    @Override
    public void eat() {
        System.out.println("狗食");
    }
    
}