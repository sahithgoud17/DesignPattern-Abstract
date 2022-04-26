package com.sahith.classes;

import com.sahith.interfaces.Animal;
import com.sahith.interfaces.AnimalToy;

public class Main
{
    public static void main(String[] args)
    {
        Animal animal = new Cow();
        AnimalToy animalToy = new CowToy();

        AnimalToy animalAdapter = new AnimalAdapter(animal);

        System.out.println("Cow : ");
        animal.walk();
        animal.animalSound();

        System.out.println("Cow Toy: ");
        animalAdapter.toySound();

    }
}
