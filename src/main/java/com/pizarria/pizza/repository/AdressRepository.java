package com.pizarria.pizza.repository;

import com.pizarria.pizza.entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress, Long> {
}
