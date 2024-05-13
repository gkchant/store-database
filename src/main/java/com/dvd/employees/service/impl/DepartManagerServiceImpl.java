package com.dvd.employees.service.impl;

import com.dvd.employees.dto.DeptManagerDto;
import com.dvd.employees.entity.DeptManager;
import com.dvd.employees.exception.ResourceNotFoundExpection;
import com.dvd.employees.mapper.DeptManagerMapper;
import com.dvd.employees.repository.DeptManagerRepository;
import com.dvd.employees.service.DeptManagerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DepartManagerServiceImpl implements DeptManagerService {
    private DeptManagerRepository deptManagerRepository;

    @Override
    public DeptManagerDto getDeptManagerByNo(int empNo) {
        DeptManager deptManager = deptManagerRepository.findById(empNo)
                .orElseThrow(()-> new ResourceNotFoundExpection("Manager Not Found : " + empNo));
        return DeptManagerMapper.mapToDeptManagerDto(deptManager);
    }

    @Override
    public List<DeptManagerDto> getDeptManagerByNo() {
        List<DeptManager> deptManager = deptManagerRepository.findAll();
        return deptManager.stream().map(DeptManagerMapper::mapToDeptManagerDto).collect(Collectors.toList());
    }
}
