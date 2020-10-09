package com.kalvinzhao.zoo.controllers;

import com.kalvinzhao.zoo.models.Animal;
import com.kalvinzhao.zoo.services.AnimalService;
import com.kalvinzhao.zoo.views.AnimalCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
//    http://localhost:2019/animals/count

    @Autowired
    private AnimalService animalService;

    @GetMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> listAllAnimal(){
        List<AnimalCount> animals = animalService.findAll();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }
}
