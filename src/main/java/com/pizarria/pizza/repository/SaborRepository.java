package com.pizarria.pizza.repository;

import com.pizarria.pizza.entity.Sabor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaborRepository extends JpaRepository<Sabor, Integer> {
}
