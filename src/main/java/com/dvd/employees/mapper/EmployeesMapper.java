package com.dvd.employees.mapper;

import com.dvd.employees.dto.EmployeesDto;
import com.dvd.employees.entity.Employees;

public class EmployeesMapper {
    public static EmployeesDto mapToEmployeesDto(Employees employees) {
        return new EmployeesDto(employees.getEmpNo(), employees.getBirthDate(),
                employees.getFirstName(), employees.getLastName(),
                employees.getGender(), employees.getHireDate());
    }

    public static Employees mapToEmployees(EmployeesDto employeesDto) {
        return new Employees(employeesDto.getEmpNo(), employeesDto.getBirthDate(),
                employeesDto.getFirstName(), employeesDto.getLastName(),
                employeesDto.getGender(), employeesDto.getHireDate());
    }
}
