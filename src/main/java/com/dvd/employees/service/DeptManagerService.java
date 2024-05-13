package com.dvd.employees.service;

import com.dvd.employees.dto.DeptManagerDto;

import java.util.List;

public interface DeptManagerService {
    DeptManagerDto getDeptManagerByNo(int empNo);

    List<DeptManagerDto> getDeptManagerByNo();
}
