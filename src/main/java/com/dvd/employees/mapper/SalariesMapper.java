package com.dvd.employees.mapper;

import com.dvd.employees.dto.SalariesDto;
import com.dvd.employees.entity.Salaries;

public class SalariesMapper {
    public static SalariesDto mapToSalariesDto(Salaries salaries) {
        return new SalariesDto(salaries.getEmpNo(), salaries.getSalary(),
                salaries.getFromDate(), salaries.getToDate());
    }

    public static Salaries mapToSalaries(SalariesDto salariesDto) {
        return new Salaries(salariesDto.getEmpNo(), salariesDto.getSalary(),
                salariesDto.getFromDate(), salariesDto.getToDate());
    }
}
