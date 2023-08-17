package com.pizarria.pizza.repository;

import com.pizarria.pizza.entity.PizzaSabor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaSaborRepository extends JpaRepository<PizzaSabor, Integer> {
}
