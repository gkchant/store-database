package com.dvd.employees.repository;

import com.dvd.employees.entity.DeptEmp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptEmpRepository extends JpaRepository<DeptEmp, Integer> {
}
