package com.dvd.employees.repository;

import com.dvd.employees.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepository extends JpaRepository<Departments, String> {
}
