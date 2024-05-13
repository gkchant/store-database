package com.dvd.employees.service.impl;

import com.dvd.employees.dto.DepartmentsDto;
import com.dvd.employees.entity.Departments;
import com.dvd.employees.exception.ResourceNotFoundExpection;
import com.dvd.employees.repository.DepartmentsRepository;
import com.dvd.employees.mapper.DepartmentMapper;
import com.dvd.employees.service.DepartmentsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentsService {
    private DepartmentsRepository departmentsRepository;

    @Override
    public DepartmentsDto getDepartmentsByNo(String deptNo) {
        Departments departments = departmentsRepository.findById(deptNo)
                .orElseThrow(()-> new ResourceNotFoundExpection("Department Not Found : " + deptNo));
        return DepartmentMapper.mapToDepartmentsDto(departments);
    }

    @Override
    public List<DepartmentsDto> getDepartments() {
        List<Departments> departments = departmentsRepository.findAll();
        return departments.stream().map(DepartmentMapper::mapToDepartmentsDto).collect(Collectors.toList());
    }

}
