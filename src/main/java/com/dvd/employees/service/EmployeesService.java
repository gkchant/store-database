package com.dvd.employees.service;

import com.dvd.employees.dto.EmployeesDto;

import java.util.List;


public interface EmployeesService {
    EmployeesDto getEmployeesByNo(int empNo);

    List<EmployeesDto> getAllEmployees();
}
