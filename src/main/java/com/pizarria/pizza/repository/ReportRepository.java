package com.pizarria.pizza.repository;

import com.pizarria.pizza.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Integer> {
}
