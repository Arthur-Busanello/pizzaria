package com.pizarria.pizza.dto;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class ReportDTO {
    private int id;
    private Timestamp data;
    private int totalOrders;
    private int canceledOrders;
    private int ordersDelivered;
    private int withdrawnOrders;
    private float totalBillingCard;
    private float totalBillingMoney;
    private int ordersId;
}
