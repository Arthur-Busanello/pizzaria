package com.pizarria.pizza.repository;

import com.pizarria.pizza.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
