package com.dvd.employees.mapper;

import com.dvd.employees.dto.DeptEmpDto;
import com.dvd.employees.entity.DeptEmp;

public class DeptEmpMapper {
    public static DeptEmpDto mapToDeptEmpDto(DeptEmp deptEmp) {
        return new DeptEmpDto(
                deptEmp.getEmpNo(), deptEmp.getDeptNo(), deptEmp.getFromDate(), deptEmp.getToDate()
        );
    }

    public static DeptEmp mapToDeptEmp(DeptEmpDto deptEmpDto) {
        return new DeptEmp(
                deptEmpDto.getEmpNo(), deptEmpDto.getDeptNo(), deptEmpDto.getFromDate(), deptEmpDto.getToDate()
        );
    }
}
