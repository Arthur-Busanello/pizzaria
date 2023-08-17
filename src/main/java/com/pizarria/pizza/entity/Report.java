package com.pizarria.pizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;
@Entity
@Data
public class Report {
    @Id
    private long id;
    private Timestamp data;
    private int totalOrders;
    private int canceledOrders;
    private int ordersDelivered;
    private int withdrawnOrders;
    private float totalBillingCard;
    private float totalBillingMoney;
    private int ordersId;
}
