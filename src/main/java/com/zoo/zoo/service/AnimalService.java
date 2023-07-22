package com.zoo.zoo.service;

import com.zoo.zoo.model.dto.AdoptRequestDto;
import com.zoo.zoo.model.entity.AnimalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
    public ResponseEntity<String> adoptAnAnimal(AdoptRequestDto requestDto) {
        return new ResponseEntity<>("입양되었습니다.", HttpStatus.OK);
    }
}
