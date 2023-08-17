package com.pizarria.pizza.repository;

import com.pizarria.pizza.entity.ClientAdress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientAdressRepository extends JpaRepository<ClientAdress, Integer> {
}
