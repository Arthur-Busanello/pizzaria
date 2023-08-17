package com.pizarria.pizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Delivery {
    @Id
    private long id;
    private int metododelivery;
    private String deliveryname;
    private float valuedelivery;
    private int orders_id;
}
