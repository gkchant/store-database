package com.dvd.employees.controller;

import com.dvd.employees.dto.EmployeesDto;
import com.dvd.employees.service.EmployeesService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
    private EmployeesService employeesService;

    //Build Get Employees REST API
    @GetMapping("{empNo}")
    public ResponseEntity<EmployeesDto> getEmployeesByNo(@PathVariable("empNo") int empNo) {
        EmployeesDto employeesDto = employeesService.getEmployeesByNo(empNo);
        return ResponseEntity.ok(employeesDto);
    }

    //Build Get All Employees REST API
    @GetMapping
    public ResponseEntity<List<EmployeesDto>> getAllEmployees() {
        List<EmployeesDto> employeesDto = employeesService.getAllEmployees();
        return ResponseEntity.ok(employeesDto);
    }
}
