package com.zoo.zoo.controller;

import com.zoo.zoo.model.dto.AdoptRequestDto;
import com.zoo.zoo.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;

    @PostMapping("/animal")
    public ResponseEntity<String> adoptAnAnimal(AdoptRequestDto requestDto) {
        return animalService.adoptAnAnimal(requestDto);
    }
}

