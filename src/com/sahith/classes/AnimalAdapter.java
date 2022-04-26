package com.sahith.classes;

import com.sahith.interfaces.Animal;
import com.sahith.interfaces.AnimalToy;

class AnimalAdapter implements AnimalToy
{
    Animal animal;

    public AnimalAdapter(Animal animal)
    {
        this.animal = animal;
    }

    @Override
    public void toySound()
    {
        animal.animalSound();
    }
}
