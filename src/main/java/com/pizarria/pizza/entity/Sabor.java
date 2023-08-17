package com.pizarria.pizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Sabor {
    @Id
    private long id;
    private String nome;
    private float precoAdicional;
}
