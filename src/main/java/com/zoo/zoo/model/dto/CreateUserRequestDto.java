package com.zoo.zoo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateUserRequestDto {
    private String userName;
    private String gender;
}
