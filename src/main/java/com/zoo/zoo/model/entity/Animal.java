package com.zoo.zoo.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private AnimalType species;

    @Column
    private String name;

    @Column
    private String gender;

    public Animal(AnimalType species, String name, String gender) {
        this.species = species;
        this.name = name;
        this.gender = gender;
    }
}
