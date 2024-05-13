package com.dvd.employees.service.impl;

import com.dvd.employees.dto.DeptEmpDto;
import com.dvd.employees.entity.DeptEmp;
import com.dvd.employees.exception.ResourceNotFoundExpection;
import com.dvd.employees.mapper.DeptEmpMapper;
import com.dvd.employees.repository.DeptEmpRepository;
import com.dvd.employees.service.DeptEmpService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DeptEmpServiceImpl implements DeptEmpService {
    private DeptEmpRepository deptEmpRepository;

    @Override
    public DeptEmpDto getDeptEmpByNo(int empNo) {
        DeptEmp deptEmp = deptEmpRepository.findById(empNo)
                .orElseThrow(()-> new ResourceNotFoundExpection("Employee Not Found : " + empNo));
        return DeptEmpMapper.mapToDeptEmpDto(deptEmp);
    }

    @Override
    public List<DeptEmpDto> getDeptEmpByDeptId() {
        List<DeptEmp> deptEmp = deptEmpRepository.findAll();
        return deptEmp.stream().map(DeptEmpMapper::mapToDeptEmpDto).collect(Collectors.toList());
    }
}
