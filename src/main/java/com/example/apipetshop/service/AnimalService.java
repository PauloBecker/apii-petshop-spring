package com.example.apipetshop.service;

import com.example.apipetshop.exception.UserNotFoundException;
import com.example.apipetshop.model.Animal;
import com.example.apipetshop.repo.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AnimalService {

    private final AnimalRepo animalRepo;

    @Autowired
    public AnimalService(AnimalRepo animalRepo){
        this.animalRepo = animalRepo;
    }

    public Animal addAnimal(Animal animal){
        animal.setAnimalCode((UUID.randomUUID().toString()));

        return animalRepo.save(animal);
    }

    public List<Animal> findAllAnimals(){

        return animalRepo.findAll();
    }

    public Animal updateAnimal(Animal animal){
        return animalRepo.save(animal);
    }

    public Animal findAnimalById(Long id){
        return animalRepo.findAnimalById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id" + id + " was not found"));
    }

    public void deleteAnimal(Long id){
        animalRepo.deleteAnimalById(id);
    }

}
