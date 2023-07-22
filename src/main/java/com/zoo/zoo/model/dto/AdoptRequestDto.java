package com.zoo.zoo.model.dto;

import com.zoo.zoo.model.entity.AnimalType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AdoptRequestDto {
    private AnimalType species;
    private String name;
    private String gender;
}
