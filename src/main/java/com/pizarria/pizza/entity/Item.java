package com.pizarria.pizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Item {
    @Id
    private long id;
    private int tamanho;
    private String codigo;
    private float preco;
    private boolean pizza;
    private String extra;
    private String remove;
    private float value;
}
