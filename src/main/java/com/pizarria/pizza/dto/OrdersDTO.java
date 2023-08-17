package com.pizarria.pizza.dto;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class OrdersDTO {
    private int id;
    private Timestamp data;
    private int payment;
    private int status;
    private String description;
    private int clientId;
    private int itemId;
    private int drinkId;
}
