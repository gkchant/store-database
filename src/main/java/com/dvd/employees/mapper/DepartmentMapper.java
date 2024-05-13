package com.dvd.employees.mapper;

import com.dvd.employees.dto.DepartmentsDto;
import com.dvd.employees.entity.Departments;

public class DepartmentMapper {
    public static DepartmentsDto mapToDepartmentsDto(Departments departments) {
        return new DepartmentsDto(
                departments.getDeptNo(), departments.getDeptName()
        );
    }

    public static Departments mapToDepartments(DepartmentsDto departmentsDto) {
        return new Departments(
                departmentsDto.getDeptNo(), departmentsDto.getDeptName()
        );
    }
}
