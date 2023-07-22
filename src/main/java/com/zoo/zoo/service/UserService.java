package com.zoo.zoo.service;

import com.zoo.zoo.model.dto.CreateUserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private AnimalService animalService;

    public ResponseEntity<String> createUser(CreateUserRequestDto requestDto) {
        return new ResponseEntity<>("이용자 등록이 완료되었습니다.", HttpStatus.OK);
    }
}
