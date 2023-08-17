package com.pizarria.pizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Adress {
    @Id
private long id;
private String city;
private String street;
private int streetnumber;
    public Adress(long id, String city, String street, int streetnumber) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.streetnumber = streetnumber;
    }



    public Adress() {

    }
}
