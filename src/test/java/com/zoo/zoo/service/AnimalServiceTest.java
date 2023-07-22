package com.zoo.zoo.service;

import com.zoo.zoo.model.dto.AdoptRequestDto;
import com.zoo.zoo.model.entity.AnimalType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("test")
@SpringBootTest
class AnimalServiceTest {
    @Autowired
    AnimalService animalService;

    @Test
    @DisplayName("동물 하나를 입양하면 \"입양되었습니다.\"의 응답이 나오며 HTTP.OK를 반환한다.")
    public void adoptAnimal() {
        // given
        AdoptRequestDto requestDto = new AdoptRequestDto(AnimalType.FOX, "미호", "female");

        // when
        ResponseEntity<String> response = animalService.adoptAnAnimal(requestDto);

        // then
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("입양되었습니다.");
    }
}