package com.pizarria.pizza.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PizzaSabor {
    @Id
    private long id;
    private int idPizza;
    private int idSabor;
}
