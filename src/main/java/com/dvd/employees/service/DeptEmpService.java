package com.dvd.employees.service;

import com.dvd.employees.dto.DeptEmpDto;

import java.util.List;

public interface DeptEmpService {
    DeptEmpDto getDeptEmpByNo(int empNo);

    List<DeptEmpDto> getDeptEmpByDeptId();

}
