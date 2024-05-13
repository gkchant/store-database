package com.dvd.employees.repository;

import com.dvd.employees.entity.Salaries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalariesRepository extends JpaRepository<Salaries, Integer> {
}
