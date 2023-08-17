package com.pizarria.pizza.dto;

import lombok.Data;

@Data
public class ItemDTO {
    private int id;
    private int tamanho;
    private String codigo;
    private float preco;
    private boolean pizza;
    private String extra;
    private String remove;
    private float value;
}
