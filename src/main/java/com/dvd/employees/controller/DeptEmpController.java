package com.dvd.employees.controller;

import com.dvd.employees.dto.DeptEmpDto;
import com.dvd.employees.service.DeptEmpService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/dept-emp")
public class DeptEmpController {
    private DeptEmpService deptEmpService;

    //Build Get Employees REST API
    @GetMapping("{empNo}")
    public ResponseEntity<DeptEmpDto> getDeptEmpByNo(@PathVariable("empNo") int empNo) {
        DeptEmpDto deptEmpDto = deptEmpService.getDeptEmpByNo(empNo);
        return ResponseEntity.ok(deptEmpDto);
    }

    //Build Get All Employees REST API
    @GetMapping
    public ResponseEntity<List<DeptEmpDto>> getAllDeptEmp() {
        List<DeptEmpDto> deptEmpDto = deptEmpService.getDeptEmpByDeptId();
        return ResponseEntity.ok(deptEmpDto);
    }
}
