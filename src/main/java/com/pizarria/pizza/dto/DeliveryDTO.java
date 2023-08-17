package com.pizarria.pizza.dto;

import lombok.Data;

@Data
public class DeliveryDTO {
    private long id;
    private int methodOfDelivery;
    private String deliveryName;
    private float deliveryValue;
    private int ordersId;
}
