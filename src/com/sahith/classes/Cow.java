package com.sahith.classes;

import com.sahith.interfaces.Animal;

class Cow implements Animal
{

    @Override
    public void walk()
    {
        System.out.println("Cow is walking");
    }

    @Override
    public void animalSound()
    {
        System.out.println("The sound of the cow is MOO");
    }
}
