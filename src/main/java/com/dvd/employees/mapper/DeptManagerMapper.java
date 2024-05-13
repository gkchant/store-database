package com.dvd.employees.mapper;

import com.dvd.employees.dto.DeptManagerDto;
import com.dvd.employees.entity.DeptManager;

public class DeptManagerMapper {
    public static DeptManagerDto mapToDeptManagerDto(DeptManager deptManager) {
        return new DeptManagerDto(
                deptManager.getEmpNo(), deptManager.getDeptNo(), deptManager.getFromDate(), deptManager.getToDate()
        );
    }

    public static DeptManager mapToDeptManager(DeptManagerDto deptManagerDto) {
        return new DeptManager(
                deptManagerDto.getEmpNo(), deptManagerDto.getDeptNo(), deptManagerDto.getFromDate(), deptManagerDto.getToDate()
        );
    }

}
