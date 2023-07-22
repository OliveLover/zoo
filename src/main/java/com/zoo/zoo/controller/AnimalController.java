package com.zoo.zoo.controller;

import com.zoo.zoo.model.dto.AdoptRequestDto;
import com.zoo.zoo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    private AnimalService animalService;

    @Autowired
    public void setAnimalService (AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping("/animal")
    public ResponseEntity<String> adoptAnAnimal(AdoptRequestDto requestDto) {
        return animalService.adoptAnAnimal(requestDto);
    }
}

