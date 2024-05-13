package com.dvd.employees.service;

import com.dvd.employees.dto.DepartmentsDto;

import java.util.List;

public interface DepartmentsService {

    DepartmentsDto getDepartmentsByNo(String deptNo);

    List<DepartmentsDto> getDepartments();

}
