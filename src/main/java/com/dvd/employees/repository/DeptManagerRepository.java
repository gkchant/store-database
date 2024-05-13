package com.dvd.employees.repository;

import com.dvd.employees.entity.DeptManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptManagerRepository extends JpaRepository<DeptManager, Integer> {
}
