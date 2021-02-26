package com.example.sandwichshoprest.sandwich;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Sandwich {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Enumerated(EnumType.STRING)
    private SandwichType type;
    private Double price;
    private String ingredients;
}
