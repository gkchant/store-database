package com.dvd.employees.service;

import com.dvd.employees.dto.SalariesDto;

import java.util.List;

public interface SalariesService {
    SalariesDto getSalariesByNo(int empNo);

    List<SalariesDto> getAllSalaries();
}
