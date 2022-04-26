package com.sahith.classes;

import com.sahith.interfaces.AnimalToy;

class CowToy implements AnimalToy
{

    @Override
    public void toySound()
    {
        System.out.println("This is the sound of a Cow toy");
    }
}
