package com.example.sandwichshoprest.sandwich;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(
            mappedBy = "sandwich",
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<Ingredient> ingredients;
}
