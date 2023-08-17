package com.pizarria.pizza.controller;

import com.pizarria.pizza.dto.AdressDTO;
import com.pizarria.pizza.entity.Adress;
import com.pizarria.pizza.repository.AdressRepository;
import com.pizarria.pizza.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Controller
@Service
@RequestMapping(value = "/adress")
public class AdressController {
    @Autowired
    private AdressRepository repository;
    @Autowired
    private AdressService service;

    @PostMapping
    public ResponseEntity<Adress> create(@RequestBody AdressDTO adressDTO) {
        try {
            Adress create = service.create(adressDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(create);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
    @GetMapping("/id")
    public ResponseEntity<Adress>FindById(@RequestBody AdressDTO adressDTO){

    }

}
