package com.dvd.employees.service.impl;

import com.dvd.employees.dto.SalariesDto;
import com.dvd.employees.entity.Salaries;
import com.dvd.employees.mapper.SalariesMapper;
import com.dvd.employees.repository.SalariesRepository;
import com.dvd.employees.service.SalariesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SalariesServiceImpl implements SalariesService {
    private SalariesRepository salariesRepository;

    @Override
    public SalariesDto getSalariesByNo(int empNo) {
        Salaries salaries = salariesRepository.findById(empNo)
                .orElseThrow(() -> new RuntimeException("Salaries not found : " + empNo));
        return SalariesMapper.mapToSalariesDto(salaries);
    }

    @Override
    public List<SalariesDto> getAllSalaries() {
        List<Salaries> salaries = salariesRepository.findAll();
        return salaries.stream().map(SalariesMapper::mapToSalariesDto).collect(Collectors.toList());
    }
}
