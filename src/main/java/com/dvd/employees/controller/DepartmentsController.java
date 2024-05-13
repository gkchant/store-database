package com.dvd.employees.controller;

import com.dvd.employees.dto.DepartmentsDto;
import com.dvd.employees.service.DepartmentsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {
    private DepartmentsService departmentsService;

    //Build Get Departments REST API
    @GetMapping("{deptNo}")
    public ResponseEntity<DepartmentsDto> getDepartmentsByNo(@PathVariable("deptNo") String deptNo) {
        DepartmentsDto departmentsDto = departmentsService.getDepartmentsByNo(deptNo);
        return ResponseEntity.ok(departmentsDto);
    }

    //Build Get All Departments REST API
    @GetMapping
    public ResponseEntity<List<DepartmentsDto>> getAllDepartments() {
        List<DepartmentsDto> departments = departmentsService.getDepartments();
        return ResponseEntity.ok(departments);
    }

}
