package com.dvd.employees.controller;

import com.dvd.employees.dto.DeptManagerDto;
import com.dvd.employees.service.DeptManagerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/dept-manager")
public class DeptManagerController {
    private DeptManagerService deptManagerService;

    //Build Get Managers REST API
    @GetMapping("{empNo}")
    public ResponseEntity<DeptManagerDto> deptManagerByNo(@PathVariable("empNo") int empNo) {
        DeptManagerDto deptManagerDto = deptManagerService.getDeptManagerByNo(empNo);
        return ResponseEntity.ok(deptManagerDto);
    }

    //Build Get All Managers REST API
    @GetMapping
    public ResponseEntity<List<DeptManagerDto>> getAllDeptManager() {
        List<DeptManagerDto> deptManagerDto = deptManagerService.getDeptManagerByNo();
        return ResponseEntity.ok(deptManagerDto);
    }
}
