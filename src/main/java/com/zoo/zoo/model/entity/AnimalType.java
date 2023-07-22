package com.zoo.zoo.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum AnimalType {
    FOX("fox", 4, "howl!"),
    LION("lion", 4, "roar!");

    private String species;
    private int numberOfLegs;
    private String sounds;

    AnimalType(String species, int numberOfLegs, String sounds) {
        this.species = species;
        this.numberOfLegs = numberOfLegs;
        this.sounds = sounds;
    }
}
