package com.pizarria.pizza.service;

import com.pizarria.pizza.dto.AdressDTO;
import com.pizarria.pizza.entity.Adress;
import com.pizarria.pizza.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class AdressService {
    @Autowired
    private AdressRepository repository;


    public Adress create(AdressDTO adressDTO) {
        if (adressDTO.getCity() == null || adressDTO.getCity().trim().isEmpty()) {
            throw new IllegalArgumentException("O texto do lembrete não pode ser nulo ou vazio.");
        }

        Adress adress = new Adress();
        adress.setCity(adressDTO.getCity());
        adress.setStreet(adressDTO.getStreet());
        adress.setStreetnumber(adressDTO.getStreetnumber());

        return repository.save(adress);
    }

}
