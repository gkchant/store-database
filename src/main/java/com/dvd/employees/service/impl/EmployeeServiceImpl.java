package com.dvd.employees.service.impl;

import com.dvd.employees.dto.EmployeesDto;
import com.dvd.employees.entity.Employees;
import com.dvd.employees.exception.ResourceNotFoundExpection;
import com.dvd.employees.mapper.EmployeesMapper;
import com.dvd.employees.repository.EmployeesRepository;
import com.dvd.employees.service.EmployeesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeesService {
    private EmployeesRepository employeesRepository;

    @Override
    public EmployeesDto getEmployeesByNo(int empNo) {
        Employees employees = employeesRepository.findById(empNo)
                .orElseThrow(()-> new ResourceNotFoundExpection("Employee Not Found : " + empNo));
        return EmployeesMapper.mapToEmployeesDto(employees);
    }

    @Override
    public List<EmployeesDto> getAllEmployees() {
        List<Employees> employees = employeesRepository.findAll();
        return employees.stream().map(EmployeesMapper::mapToEmployeesDto).collect(Collectors.toList());
    }
}
