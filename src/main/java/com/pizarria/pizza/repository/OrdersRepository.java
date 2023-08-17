package com.pizarria.pizza.repository;

import com.pizarria.pizza.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
