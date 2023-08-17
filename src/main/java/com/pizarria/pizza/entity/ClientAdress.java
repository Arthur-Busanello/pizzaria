package com.pizarria.pizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ClientAdress {
    @Id
    private long id;
    private int clientId;
    private int addressId;


}

