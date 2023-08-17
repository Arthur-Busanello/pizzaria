package com.pizarria.pizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Orders {
    @Id
    private long id;
    private java.sql.Timestamp data;
    private int payment;
    private int status;
    private String description;
    private int clientId;
    private int itemId;
    private int drinkId;
}
