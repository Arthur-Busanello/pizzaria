package com.pizarria.pizza.dto;

import lombok.Data;

@Data
public class AdressDTO {
    private long id;
    private String city;
    private String street;
    private int streetnumber;

}
