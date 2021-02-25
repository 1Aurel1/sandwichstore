package com.example.sandwichshoprest.sandwich;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Ingredient {
    @Id
    @Enumerated(EnumType.STRING)
    private IngredientEnum ingredient;

    @ManyToOne
    @JoinColumn(name = "sandwich_id", referencedColumnName = "id")
    private Sandwich sandwich;
}
