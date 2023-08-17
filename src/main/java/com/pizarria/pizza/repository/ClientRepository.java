package com.pizarria.pizza.repository;

import com.pizarria.pizza.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
