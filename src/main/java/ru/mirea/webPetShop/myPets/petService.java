package ru.mirea.webPetShop.myPets;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class petService {
    public List<Pet> pets() {

        List<Pet> pets = new LinkedList<Pet>();
        Pet cat = new Pet(3, 4, "chat");
        pets.add(cat);

        return pets;
    }
}

