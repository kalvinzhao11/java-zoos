package com.kalvinzhao.zoo.services;

import com.kalvinzhao.zoo.models.Animal;
import com.kalvinzhao.zoo.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImp implements AnimalService{

    @Autowired
    AnimalRepository animalRepo;
    @Override
    public List<Animal> findAll() {
        List<Animal> animals = new ArrayList<>();
        animalRepo.findAll().iterator().forEachRemaining(animals::add);
        return animals;
    }
}
